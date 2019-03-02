package com.dmall.delivery.strategy.statestrategy;

import com.dmall.delivery.common.exception.vo.DeliveryBaseVO;
import com.dmall.delivery.strategy.ValidationStrategy;
import com.dmall.delivery.strategy.validationenum.ValidationType;

/**
 * RedeliverProcessedStateStrategy
 *
 * @author junyuan.chen
 * @date 19-3-1
 */
public enum RedeliverProcessedStateStrategy implements ValidationStrategy {

    HASORDER(ValidationType.HASORDER){
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
    },

    PRODUCTIONTYPE(ValidationType.PRODUCTIONTYPE){
        @Override
        public <T extends DeliveryBaseVO> boolean validate(T input) {
            return false;
        }
    },


    ;

    private ValidationType validationType;

    RedeliverProcessedStateStrategy(ValidationType validationType) {
        this.validationType = validationType;
    }

    @Override
    public ValidationType getValidationType() {
        return null;
    }
}
