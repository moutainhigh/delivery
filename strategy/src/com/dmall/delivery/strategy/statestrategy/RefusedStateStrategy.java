package com.dmall.delivery.strategy.statestrategy;

import com.dmall.delivery.common.exception.vo.DeliveryBaseVO;
import com.dmall.delivery.strategy.ValidationStrategy;
import com.dmall.delivery.strategy.validationenum.ValidationType;

/**
 * RefusedStateStrategy
 *
 * @author junyuan.chen
 * @date 19-3-1
 */
public enum RefusedStateStrategy implements ValidationStrategy {

    PRODUCTIONTYPE(ValidationType.PRODUCTIONTYPE){
        @Override
        public <T extends DeliveryBaseVO> boolean validate(T input) {
            return false;
        }
    }
    ;

    private ValidationType validationType;

    RefusedStateStrategy(ValidationType validationType) {
        this.validationType = validationType;
    }

    @Override
    public ValidationType getValidationType() {
        return validationType;
    }
}
