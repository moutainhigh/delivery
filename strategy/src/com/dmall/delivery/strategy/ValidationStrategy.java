package com.dmall.delivery.strategy;

/**
 * ValidationStrategy
 *
 * @author junyuan.chen
 * @date 19-2-28
 */
public interface ValidationStrategy extends Strategy{

    @Override
    <T> boolean validate(T input);

    ValidationStrategy getValidationType();
}
