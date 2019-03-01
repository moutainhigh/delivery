package com.dmall.delivery.strategy;

import com.dmall.delivery.strategy.validationenum.ValidationType;

/**
 * ValidationStrategy
 *
 * @author junyuan.chen
 * @date 19-2-28
 */
public interface ValidationStrategy extends Strategy{

    @Override
    boolean validate(Object input);

    ValidationType getValidationType();
}
