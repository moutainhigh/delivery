package com.dmall.delivery.state;

import com.dmall.delivery.common.vo.DeliveryBaseVO;

import java.util.Observable;

public abstract class ObservableState extends Observable implements State {

    public boolean isChangedState = false;

    public void doActionWithObserve(DeliveryBaseVO deliveryBaseVO){
        doAction(deliveryBaseVO);
        if (isChangeState()){
            setChanged();
            notifyObservers(deliveryBaseVO);
        }
    }

    @Override
    public boolean isChangeState() {
        return isChangedState;
    }

    @Override
    public void changeState() {
        isChangedState = true;
    }
}
