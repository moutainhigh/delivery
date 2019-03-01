package com.dmall.delivery.strategy.validationenum;

/**
 * ValidationType
 *
 * @author junyuan.chen
 * @date 19-3-1
 */
public enum ValidationType {
    /**
     * 可配置选择项
     */
    ORDERSTATUS,
    ORDERSTATUSCODE,
    PRODUCTIONTYPE,
    SHIPMENTTYPE,
    TRADETYPE,
    CARRIERTYPE,
    ORDERORINGIN,

    /**
     * *************************组合判断项**************************
     */
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
     * 是否含有TASK信息
     */
    HASTASK,
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
    ISTAKEOVER,
    /**
     * 链商直流订单，妥投时校验上传图片参数
     */
    LSCHECKIMAGE,
    /**
     * 链商取件订单不支持妥投操作
     */
    LSCANNOTCOMPLETE
}
