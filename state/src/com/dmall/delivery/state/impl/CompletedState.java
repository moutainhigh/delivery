package com.dmall.delivery.state.impl;

import com.dmall.delivery.state.State;

/**
 * OrderCompletedState
 *
 * @author junyuan.chen
 * @date 19-2-28
 */
public class CompletedState implements State {
    @Override
    public void before() {

    }

    @Override
    public void after() {

    }

    @Override
    public boolean isChangeState() {
        return false;
    }

    @Override
    public boolean changeState() {
        return false;
    }
}