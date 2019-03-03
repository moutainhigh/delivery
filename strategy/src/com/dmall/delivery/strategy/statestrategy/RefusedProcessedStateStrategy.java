package com.dmall.delivery.strategy.statestrategy;

import com.dmall.delivery.common.vo.DeliveryBaseVO;
import com.dmall.delivery.strategy.ValidationStrategy;
import com.dmall.delivery.strategy.validationenum.ValidationType;

/**
 * RefusedProcessedStateStrategy
 *
 * @author junyuan.chen
 * @date 19-3-1
 */
public enum RefusedProcessedStateStrategy implements ValidationStrategy {
    ISORDERNULL(ValidationType.ISORDERNULL){
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

    /**
     *  没有拒收表，该业务是否后期需要拒收的其他校验！！！
     */

    HASREFUSEINFO(ValidationType.HASREFUSEINFO) {
        @Override
        public <T extends DeliveryBaseVO> boolean validate(T input) {
            return false;
        }
    },

    CARRIERTYPE(ValidationType.CARRIERTYPE){
        @Override
        public <T extends DeliveryBaseVO> boolean validate(T input) {
            return false;
        }
    },

    ORDERORINGIN(ValidationType.ORDERORINGIN){
        @Override
        public <T extends DeliveryBaseVO> boolean validate(T input) {
            return false;
        }
    },

    ORDERSTATUS(ValidationType.ORDERSTATUS){
        @Override
        public <T extends DeliveryBaseVO> boolean validate(T input) {
            return false;
        }
    }
    ;

    private ValidationType validationType;

    RefusedProcessedStateStrategy(ValidationType validationType) {
        this.validationType = validationType;
    }

    @Override
    public ValidationType getValidationType() {
        return validationType;
    }
}
