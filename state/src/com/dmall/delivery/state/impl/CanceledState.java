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
    public void before(State state) {

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
    public boolean changeState() {
        return false;
    }
}
