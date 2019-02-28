package com.dmall.delivery.state.impl;

import com.dmall.delivery.common.exception.DeliveryException;
import com.dmall.delivery.state.State;

/**
 * CanceledState
 *
 * @author junyuan.chen
 * @date 19-2-28
 */
public class CanceledState implements State {

    private boolean isStateChange;



    @Override
    public State before(State state) {
        //1.使用策略

        //2.更改状态
        return changeState();
    }

    @Override
    public void after(State state) {
        throw new DeliveryException("End");
    }

    @Override
    public boolean isChangeState() {
        return isStateChange;
    }

    @Override
    public State changeState() {
        //改变状态需要做的操作
        return new InitProcessState();
    }
}
