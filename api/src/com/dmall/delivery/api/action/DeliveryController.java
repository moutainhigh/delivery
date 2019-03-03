package com.dmall.delivery.api.action;

import com.dmall.delivery.common.vo.DeliveryTaskVO;
import com.dmall.delivery.context.StateContext;
import com.dmall.delivery.context.StrategyCenter;
import com.dmall.delivery.service.DeliveryTaskService;
import com.dmall.delivery.state.State;
import com.dmall.delivery.state.impl.CompletedState;
import com.dmall.delivery.state.impl.RefusedState;
import com.dmall.delivery.strategy.ValidationStrategy;
import com.dmall.delivery.strategy.statestrategy.CompletedStateStrategy;
import com.dmall.delivery.strategy.statestrategy.RefusedStateStrategy;

import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

/**
 * DeliveryController
 * 配送相关行为的api
 *
 * @author junyuan.chen
 * @date 19-2-28
 */
public class DeliveryController {

    /**
     * 策略中心放入controller中进行逻辑使用
     * 后期可以进行配置
     */


    /**
     * 妥投API
     */

    public void deliveryComplete(String orderId){
        /**
         * 查询订单
         */
        DeliveryTaskService service = new DeliveryTaskService();
        DeliveryTaskVO deliveryTaskVO =  service.queryTaskById(orderId);
        /**
         * 当执行这个api时，我已实现知道使用的是：
         * 妥投的状态
         */
        State state = new CompletedState();
        StateContext context = new StateContext(state);
        /**
         * 查找并使用策略
         */
        Set<ValidationStrategy> strategies = new LinkedHashSet<>();
        strategies.add(CompletedStateStrategy.CHECKTOKEN);
        strategies.add(CompletedStateStrategy.HASORDER);
        strategies.add(CompletedStateStrategy.ISORDERCOMPLETE);
        strategies.add(CompletedStateStrategy.LSCANNOTCOMPLETE);
        strategies.add(CompletedStateStrategy.LSCHECKIMAGE);
        /**
         * 策略加入到状态控制中心
         */
        StrategyCenter center = new StrategyCenter(strategies);
        context.setCenter(center);
        /**
         * 执行状态机运转
         */
        context.execute(deliveryTaskVO);
        /**
         * 后续流程
         */
        //dosomething you like

    }

    /**
     * 拒收API
     */

    public void deliveryRefused(String orderId){
        /**
         * 查询订单
         */
        DeliveryTaskService service = new DeliveryTaskService();
        DeliveryTaskVO deliveryTaskVO =  service.queryTaskById(orderId);

        State state = new RefusedState();
        StateContext context = new StateContext(state);

        /**
         * 查找并使用策略
         * 使用Queue代表此策略顺序执行
         */
        Queue<ValidationStrategy> strategies = new PriorityQueue<>();
        strategies.add(RefusedStateStrategy.HASORDER);
        strategies.add(RefusedStateStrategy.PRODUCTIONTYPE);

        /**
         * 策略加入到状态控制中心
         */
        StrategyCenter center = new StrategyCenter(strategies);
        context.setCenter(center);

        /**
         * 执行状态机运转
         */
        context.execute(deliveryTaskVO);
        /**
         * 后续流程
         */
        //dosomething you like

    }

}
