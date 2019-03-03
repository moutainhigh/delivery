package com.dmall.delivery.strategy.statestrategy;

import com.dmall.delivery.common.vo.DeliveryBaseVO;
import com.dmall.delivery.strategy.ValidationStrategy;
import com.dmall.delivery.strategy.validationenum.ValidationType;

/**
 * WaitingDistributeStateStrategy
 *
 * @author junyuan.chen
 * @date 19-3-1
 */
public enum WaitingDistributeStateStrategy implements ValidationStrategy {

    NOTHING(ValidationType.NOTHING){
        @Override
        public <T extends DeliveryBaseVO> boolean validate(T input) {
            return true;
        }
    }

    ;

    private ValidationType validationType;

    WaitingDistributeStateStrategy(ValidationType validationType) {
        this.validationType = validationType;
    }

    @Override
    public ValidationType getValidationType() {
        return validationType;
    }
}
