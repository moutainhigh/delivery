package com.dmall.delivery.strategy;

import com.dmall.delivery.common.exception.vo.DeliveryBaseVO;
import com.dmall.delivery.strategy.validationenum.ValidationType;

/**
 * ValidationStrategy
 *
 * @author junyuan.chen
 * @date 19-2-28
 */
public interface ValidationStrategy extends Strategy{

    <T extends DeliveryBaseVO> boolean validate(T input);

    ValidationType getValidationType();
}
