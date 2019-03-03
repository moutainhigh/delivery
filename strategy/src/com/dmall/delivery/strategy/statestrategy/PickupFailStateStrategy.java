package com.dmall.delivery.strategy.statestrategy;

import com.dmall.delivery.common.vo.DeliveryBaseVO;
import com.dmall.delivery.strategy.ValidationStrategy;
import com.dmall.delivery.strategy.validationenum.ValidationType;

/**
 * PickupFailStateStrategy
 *
 * @author junyuan.chen
 * @date 19-3-1
 */
public enum PickupFailStateStrategy implements ValidationStrategy {
    CHECKTOKEN(ValidationType.CHECKTOKEN){
        @Override
        public <T extends DeliveryBaseVO> boolean validate(T input) {
            return false;
        }
    },

    HASREFUSEINFO(ValidationType.HASREFUSEINFO){
        @Override
        public <T extends DeliveryBaseVO> boolean validate(T input) {
            return false;
        }
    },
    HASORDER(ValidationType.HASORDER){
        @Override
        public <T extends DeliveryBaseVO> boolean validate(T input) {
            return false;
        }
    },
    PRODUCTIONTYPE(ValidationType.PRODUCTIONTYPE){
        @Override
        public <T extends DeliveryBaseVO> boolean validate(T input) {
            return false;
        }
    },
    HASTASK(ValidationType.HASTASK){
        @Override
        public <T extends DeliveryBaseVO> boolean validate(T input) {
            return false;
        }
    },
    ISORDERCOMPLETE(ValidationType.ISORDERCOMPLETE){
        @Override
        public <T extends DeliveryBaseVO> boolean validate(T input) {
            return false;
        }
    }

    ;

    private ValidationType validationType;

    PickupFailStateStrategy(ValidationType validationType) {
        this.validationType = validationType;
    }

    @Override
    public ValidationType getValidationType() {
        return null;
    }
}
