package com.dmall.delivery.strategy.statestrategy;

import com.dmall.delivery.common.exception.OrderStatusEnum;
import com.dmall.delivery.strategy.validationenum.ConfigValidationType;
import com.dmall.delivery.strategy.ValidationStrategy;

/**
 * CanceledStateStrategy
 *
 * @author junyuan.chen
 * @date 19-3-1
 */
public enum CanceledStateStrategy implements ValidationStrategy {

    ORDERSTATUS(ConfigValidationType.ORDERSTATUS){
        @Override
        public boolean validate(Object input) {
            return (Integer)input< OrderStatusEnum.OrderCanceled.getKey();
        }
    };


    private ConfigValidationType configValidationType;

    private CanceledStateStrategy(ConfigValidationType configValidationType) {
        this.configValidationType = configValidationType;
    }

    @Override
    public ValidationStrategy getValidationType() {
        return null;
    }
}
