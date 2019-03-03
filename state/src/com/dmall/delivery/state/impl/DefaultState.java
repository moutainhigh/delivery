package com.dmall.delivery.state.impl;

import com.dmall.delivery.common.vo.DeliveryBaseVO;
import com.dmall.delivery.state.State;

public class DefaultState implements State {
    @Override
    public void doAction(DeliveryBaseVO deliveryBaseVO) {

    }

    @Override
    public boolean isChangeState() {
        return false;
    }

    @Override
    public void changeState() {
    }
}
