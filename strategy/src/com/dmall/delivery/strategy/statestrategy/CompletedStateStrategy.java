package com.dmall.delivery.strategy.statestrategy;

import com.dmall.delivery.strategy.ValidationStrategy;
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
    HASTASK(ValidationType.HASTASK){
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
    },
    /**
     * 组合项1:productionType!=null&&productionType==24&&ImageList!=null
     * 链商直流订单，妥投时校验上传图片参数
     */
    LSCHECKIMAGE(ValidationType.LSCHECKIMAGE){
        @Override
        public boolean validate(Object input) {
            return false;
        }
    },
    /**
     *　组合项２:productionType!=null&&productionType!=25
     * 链商取件订单不支持妥投操作
     */
    LSCANNOTCOMPLETE(ValidationType.LSCANNOTCOMPLETE){
        @Override
        public boolean validate(Object input) {
            return false;
        }
    }
    ;

    private ValidationType validationType;

    CompletedStateStrategy(ValidationType validationType) {
        this.validationType = validationType;
    }


    @Override
    public ValidationStrategy getValidationType() {
        return null;
    }
}
