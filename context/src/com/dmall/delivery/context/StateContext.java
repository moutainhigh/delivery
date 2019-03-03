package com.dmall.delivery.context;

import com.dmall.delivery.common.vo.DeliveryBaseVO;
import com.dmall.delivery.state.ObservableState;
import com.dmall.delivery.state.State;
import com.dmall.delivery.strategy.validationenum.ValidationType;

/**
 * StateTransferContext
 *
 * @author junyuan.chen
 * @date 19-3-1
 */
public class StateContext{

    private State state;

    private StrategyCenter center;

    public StateContext(State state) {
        this.state = state;
    }

    public void setCenter(StrategyCenter center) {
        this.center = center;
    }

    public boolean execute(DeliveryBaseVO deliveryBaseVO){
        /**
         * 如果有策略，则执行策略
         */
        ValidationType validationType = executeStrategies(center,deliveryBaseVO);
        if (validationType!=null){
            /**
             * 此时策略未过，返回不符合策略的类型
             * 将validationType组装到下游，以便下游可以认识
             */
            //doSomething to return error
        }
        /**
         * 策略执行完毕，开始状态扭转逻辑
         */
        if (state != null){
            /**
             * 如果State继承观察者，则调用doActionWithObserve
             * 否则调用doAction
             */
            if (state instanceof ObservableState){
                ObservableState observableState = (ObservableState)state;
                observableState.doActionWithObserve(deliveryBaseVO);
            } else {
                state.doAction(deliveryBaseVO);
            }
        }
        return state.isChangeState();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    private ValidationType executeStrategies(StrategyCenter center,DeliveryBaseVO deliveryBaseVO){
        if (center!=null){
            if (center.isSetStrategy()){
                return center.executeInSet(deliveryBaseVO);
            }else if (center.isQueueStrategy()){
                return center.executeInQueue(deliveryBaseVO);
            }
        }
        return null;
    }
}
