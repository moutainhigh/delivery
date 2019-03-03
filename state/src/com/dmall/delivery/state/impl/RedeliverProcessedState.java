package com.dmall.delivery.state.impl;

import com.dmall.delivery.common.vo.DeliveryBaseVO;
import com.dmall.delivery.state.ObservableState;
import com.dmall.delivery.state.State;

/**
 * RedeliverProcessedState
 *
 * @author junyuan.chen
 * @date 19-2-28
 */
public class RedeliverProcessedState extends ObservableState {
    @Override
    public void doAction(DeliveryBaseVO deliveryBaseVO) {
        /**
         * doAction实现私有的业务逻辑，一些无法使用模板的逻辑
         */
        //do somthing you like

        /**
         * 最后如果执行完所有的操作
         * 记得changeState
         */
        changeState();
        /**
         * 如果没有changeState，表示doAction方法的执行是失败的
         */
        //可以根据实际情况来实现返回策略
        //return Some Error
    }
}
