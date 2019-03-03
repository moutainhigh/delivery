package com.dmall.delivery.strategy.abnormalstartegy;

import com.dmall.delivery.common.vo.DeliveryBaseVO;
import com.dmall.delivery.strategy.ValidationStrategy;
import com.dmall.delivery.strategy.validationenum.ValidationType;

public enum OrderInterceptStrategy implements ValidationStrategy {

    ORDERSTATUSCODE(ValidationType.ORDERSTATUSCODE){
        @Override
        public <T extends DeliveryBaseVO> boolean validate(T input) {
            return false;
        }
    },

    TRADETYPE(ValidationType.TRADETYPE){
        @Override
        public <T extends DeliveryBaseVO> boolean validate(T input) {
            return false;
        }
    }
    ;


    private ValidationType validationType;

    OrderInterceptStrategy(ValidationType validationType) {
        this.validationType = validationType;
    }

    @Override
    public ValidationType getValidationType() {
        return null;
    }
}
