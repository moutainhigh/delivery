package com.dmall.delivery.strategy.statestrategy;

import com.dmall.delivery.strategy.ValidationStrategy;
import com.dmall.delivery.strategy.validationenum.ConfigValidationType;
import com.dmall.delivery.strategy.validationenum.ValidationType;

/**
 * CompletedStateStrategy
 *
 * @author junyuan.chen
 * @date 19-3-1
 */
public enum CompletedStateStrategy implements ValidationStrategy {

    CHECKTOKEN(ValidationType.CHECKTOKEN){
        @Override
        public boolean validate(Object input) {
            return false;
        }
    },
    HASORDER(ValidationType.HASORDER){
        @Override
        public boolean validate(Object input) {
            return false;
        }
    },
    ISORDERCOMPLETE(ValidationType.ISORDERCOMPLETE){
        @Override
        public boolean validate(Object input) {
            return false;
        }
    };



    private ValidationType validationType;

    private ConfigValidationType configValidationType;

    CompletedStateStrategy(ValidationType validationType) {
        this.validationType = validationType;
    }

    CompletedStateStrategy(ConfigValidationType configValidationType) {
        this.configValidationType = configValidationType;
    }

    CompletedStateStrategy(ConfigValidationType configValidationType,ValidationType validationType){
        this.validationType = validationType;
        this.configValidationType = configValidationType;
    }

    @Override
    public ValidationStrategy getValidationType() {
        return null;
    }
}
