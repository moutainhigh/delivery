package com.dmall.delivery.strategy.statestrategy;

import com.dmall.delivery.strategy.ValidationStrategy;
import com.dmall.delivery.strategy.validationenum.ValidationType;

/**
 * RedeliverStateStrategy
 *
 * @author junyuan.chen
 * @date 19-3-1
 */
public enum RedeliverStateStrategy implements ValidationStrategy {

    ;

    @Override
    public ValidationType getValidationType() {
        return null;
    }
}
