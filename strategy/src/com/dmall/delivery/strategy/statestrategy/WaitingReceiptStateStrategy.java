package com.dmall.delivery.strategy.statestrategy;

import com.dmall.delivery.strategy.ValidationStrategy;
import com.dmall.delivery.strategy.validationenum.ValidationType;

/**
 * WaitingReceiptStateStrategy
 *
 * @author junyuan.chen
 * @date 19-3-1
 */
public enum WaitingReceiptStateStrategy implements ValidationStrategy {
    ;

    @Override
    public ValidationType getValidationType() {
        return null;
    }
}
