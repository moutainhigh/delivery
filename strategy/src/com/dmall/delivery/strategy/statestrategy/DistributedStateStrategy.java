package com.dmall.delivery.strategy.statestrategy;

import com.dmall.delivery.common.vo.DeliveryBaseVO;
import com.dmall.delivery.strategy.ValidationStrategy;
import com.dmall.delivery.strategy.validationenum.ValidationType;

/**
 * DistributedStateStrategy
 *
 * @author junyuan.chen
 * @date 19-3-1
 */
public enum DistributedStateStrategy implements ValidationStrategy {
    ISTAKEOVER(ValidationType.ISTAKEOVER){
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
    };


    private ValidationType validationType;

    DistributedStateStrategy(ValidationType validationType) {
        this.validationType = validationType;
    }

    @Override
    public ValidationType getValidationType() {
        return validationType;
    }
}
