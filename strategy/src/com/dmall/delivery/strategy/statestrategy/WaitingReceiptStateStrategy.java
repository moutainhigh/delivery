package com.dmall.delivery.strategy.statestrategy;

import com.dmall.delivery.common.exception.vo.DeliveryBaseVO;
import com.dmall.delivery.strategy.ValidationStrategy;
import com.dmall.delivery.strategy.validationenum.ValidationType;

/**
 * WaitingReceiptStateStrategy
 *
 * @author junyuan.chen
 * @date 19-3-1
 */
public enum WaitingReceiptStateStrategy implements ValidationStrategy {
    CHECKTOKEN(ValidationType.CHECKTOKEN){
        @Override
        public <T extends DeliveryBaseVO> boolean validate(T input) {
            return false;
        }
    },

    ISORDERNULL(ValidationType.ISORDERNULL){
        @Override
        public <T extends DeliveryBaseVO> boolean validate(T input) {
            return false;
        }
    },

    HASORDER(ValidationType.HASORDER){
        @Override
        public <T extends DeliveryBaseVO> boolean validate(T input) {
            return false;
        }
    },

    ORDERSTATUSCODE(ValidationType.ORDERSTATUSCODE){
        @Override
        public <T extends DeliveryBaseVO> boolean validate(T input) {
            return false;
        }
    }



    ;

    private ValidationType validationType;

    WaitingReceiptStateStrategy(ValidationType validationType) {
        this.validationType = validationType;
    }

    @Override
    public ValidationType getValidationType() {
        return null;
    }
}
