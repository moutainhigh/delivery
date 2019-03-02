package com.dmall.delivery.strategy.statestrategy;

import com.dmall.delivery.common.exception.vo.DeliveryBaseVO;
import com.dmall.delivery.strategy.ValidationStrategy;
import com.dmall.delivery.strategy.validationenum.ValidationType;

/**
 * SelfConfirmStateStrategy
 *
 * @author junyuan.chen
 * @date 19-3-1
 */
public enum SelfConfirmStateStrategy implements ValidationStrategy {

    HASORDER(ValidationType.HASORDER){
        @Override
        public <T extends DeliveryBaseVO> boolean validate(T input) {
            return false;
        }
    },
    ISAUTH(ValidationType.ISAUTH){
        @Override
        public <T extends DeliveryBaseVO> boolean validate(T input) {
            return false;
        }
    },
    ORDERSTATUSCODE(ValidationType.ORDERSTATUSCODE){
        @Override
        public <T extends DeliveryBaseVO> boolean validate(T input) {
            return false;
        }
    },
    SHIPMENTTYPE(ValidationType.SHIPMENTTYPE){
        @Override
        public <T extends DeliveryBaseVO> boolean validate(T input) {
            return false;
        }
    }

    ;

    private ValidationType validationType;

    SelfConfirmStateStrategy(ValidationType validationType) {
        this.validationType = validationType;
    }

    @Override
    public ValidationType getValidationType() {
        return null;
    }
}
