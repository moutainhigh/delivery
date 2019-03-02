package com.dmall.delivery.strategy.statestrategy;

import com.dmall.delivery.common.exception.vo.DeliveryBaseVO;
import com.dmall.delivery.common.exception.vo.OrderStatusEnum;
import com.dmall.delivery.strategy.validationenum.ConfigValidationType;
import com.dmall.delivery.strategy.ValidationStrategy;
import com.dmall.delivery.strategy.validationenum.ValidationType;

/**
 * CanceledStateStrategy
 *
 * @author junyuan.chen
 * @date 19-3-1
 */
public enum CanceledStateStrategy implements ValidationStrategy {

    ORDERSTATUS(ValidationType.ORDERSTATUS){
        @Override
        public <T extends DeliveryBaseVO> boolean validate(T input) {
            return false;
        }
    };


    private ValidationType validationType;

    private CanceledStateStrategy(ValidationType validationType) {
        this.validationType = validationType;
    }

    @Override
    public ValidationType getValidationType() {
        return validationType;
    }
}
