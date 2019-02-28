package com.dmall.delivery.strategy.statestrategy;

import com.dmall.delivery.strategy.ValidationStrategy;

/**
 * CanceledStateStrategy
 *
 * @author junyuan.chen
 * @date 19-2-28
 */
public class CanceledStateStrategy implements ValidationStrategy {



    @Override
    public ValidationStrategy getValidationType() {
        return null;
    }
}
