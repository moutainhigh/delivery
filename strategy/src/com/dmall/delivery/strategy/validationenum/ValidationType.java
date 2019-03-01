package com.dmall.delivery.strategy.validationenum;

/**
 * ValidationType
 *
 * @author junyuan.chen
 * @date 19-3-1
 */
public enum ValidationType {
    /**
     * 检查token信息
     */
    CHECKTOKEN,
    /**
     * 订单是否存在
     */
    ISORDERNULL,
    /**
     * 订单是否完成
     */
    ISORDERCOMPLETE,
    /**
     * 订单相关的记录是否存在
     */
    HASORDER,
    /**
     * 门店权限
     */
    ISAUTH,
    /**
     * 金额判断
     */
    ISAMOUNTEQUAL,
    /**
     * 是否进行生产配送
     */
    ISCONFIRM,
    /**
     * 是否是配送订单
     * SHIPMENTTYPE==1
     */
    ISDELIVERYORDER,
    /**
     * 拦截信息
     */
    ISINTERCEPTLIST,
    /**
     * 拒收信息是否完备
     */
    HASREFUSEINFO,
    /**
     * 商品入站判断
     */
    INBOUNDNUM,
    /**
     * 配送员接单
     */
    ISTAKEOVER

}
