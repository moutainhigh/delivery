package com.dmall.delivery.strategy.statestrategy;

import com.dmall.delivery.common.exception.vo.DeliveryBaseVO;
import com.dmall.delivery.strategy.ValidationStrategy;
import com.dmall.delivery.strategy.validationenum.ValidationType;

/**
 * RedeliverStateStrategy
 *
 * @author junyuan.chen
 * @date 19-3-1
 */
public enum RedeliverStateStrategy implements ValidationStrategy {
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

    ORDE(ValidationType.ORDERSTATUS){
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
     * 实现REDELIVER判断三要素
     * 1.REASON
     * 2.REDILIVERYTIME
     * 3.REDILIVERYDATE
     * 4.拒收表是否存在数据？？？
     */
    REDELIVERRESON(ValidationType.REDELIVERRESON){
        @Override
        public <T extends DeliveryBaseVO> boolean validate(T input) {
            return false;
        }
    },

    HASTASK(ValidationType.HASTASK){
        @Override
        public <T extends DeliveryBaseVO> boolean validate(T input) {
            return false;
        }
    },




            ;

    private ValidationType validationType;

    RedeliverStateStrategy(ValidationType validationType) {
        this.validationType = validationType;
    }

    @Override
    public ValidationType getValidationType() {
        return null;
    }
}
