package com.dmall.delivery.common.vo;

/**
 * DeliveryException
 *
 * @author junyuan.chen
 * @date 19-2-28
 */
public class DeliveryException extends RuntimeException{
    protected String code;
    protected String msg;

    public DeliveryException(Throwable e) {
        super(e);
    }

    public DeliveryException(String msg){
        this.code = "9999";
        this.msg = msg;
    }

    public DeliveryException(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

}
