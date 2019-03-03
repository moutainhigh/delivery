package com.dmall.delivery.observe;

import com.dmall.delivery.common.vo.DeliveryBaseVO;
import com.dmall.delivery.mq.ProcessFlowMq;
import com.dmall.delivery.service.DeliveryTaskService;
import com.dmall.delivery.state.State;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者模式的接收者
 * 1.如果在状态机中检查发现了状态位的变化转换
 * 2.则更新数据库和MQ全流程相关的业务操作
 */
public class StateObserver implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        State state = (State)o;
        if (state.isChangeState()){
            DeliveryBaseVO deliveryBaseVO = (DeliveryBaseVO)arg;
            /**
             * 更新数据库
             */
            DeliveryTaskService service = new DeliveryTaskService();
            service.insert(deliveryBaseVO);

            /**
             * 2.更新MQ全流程
             */
            ProcessFlowMq mq = new ProcessFlowMq();
            mq.send(deliveryBaseVO);
        }

    }
}
