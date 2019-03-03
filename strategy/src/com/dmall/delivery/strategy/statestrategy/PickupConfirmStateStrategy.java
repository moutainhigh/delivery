package com.dmall.delivery.strategy.statestrategy;

import com.dmall.delivery.common.vo.DeliveryBaseVO;
import com.dmall.delivery.strategy.ValidationStrategy;
import com.dmall.delivery.strategy.validationenum.ValidationType;

/**
 * PickupConfirmStateStrategy
 * 取件完成操作
 * @author junyuan.chen
 * @date 19-3-1
 */
public enum PickupConfirmStateStrategy implements ValidationStrategy {
    /**
     * 1.checkToken
     */
    CHECKTOKEN(ValidationType.CHECKTOKEN){
        @Override
        public <T extends DeliveryBaseVO> boolean validate(T input) {
            return false;
        }
    },
    /**
     * 2.取件备注不得为空并限制位数
     */
    PICKREASON(ValidationType.PICKREASON){
        @Override
        public <T extends DeliveryBaseVO> boolean validate(T input) {
            return false;
        }
    },
    /**
     * 订单是否存在
     */
    HASORDER(ValidationType.HASORDER){
        @Override
        public <T extends DeliveryBaseVO> boolean validate(T input) {
            return false;
        }
    },
    PRODUCTIONTYPE(ValidationType.PRODUCTIONTYPE){
        @Override
        public <T extends DeliveryBaseVO> boolean validate(T input) {
            return false;
        }
    },
    /**
     * 是否取件完成
     */
    ISORDERCOMPLETE(ValidationType.ISORDERCOMPLETE){
        @Override
        public <T extends DeliveryBaseVO> boolean validate(T input) {
            return false;
        }
    }

    ;

    private ValidationType validationType;


    PickupConfirmStateStrategy(ValidationType validationType) {
        this.validationType = validationType;
    }

    @Override
    public ValidationType getValidationType() {
        return validationType;
    }
}
