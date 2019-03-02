package com.dmall.delivery.common.exception.vo;

/**
 * OrderStatusEnum
 *
 * @author junyuan.chen
 * @date 19-3-1
 */
public enum OrderStatusEnum {
    WaitingPay(1, "等待支付", 1),
    WaitingProductionPayOver(2, "支付完成", 2),
    WaitingProductionPause(2, "订单暂停", 3),
    WaitingProduction(4, "等待打印", 4),
    ProductingPrinted(8, "已打印", 8),
    ProductingPickDistributed(8, "拣货分配", 9),
    ProductingConfirmTask(8, "拣货已确认", 10),
    ProductingPicking(8, "拣货中", 11),
    ProductingPickReturn(8, "拣货退回", 12),
    ProductingPicked(8, "已拣货", 13),
    ProductingSettlementted(8, "商家已结算", 15),
    WaitingPickUp(16, "等待自提", 16),
    WaitingDistribute(16, "待分配配送员", 16),
    Redeliver(16, "配送再投", 17),
    RedeliverProcessed(16, "再投入站", 18),
    Distributed(32, "配送分配", 32),
    WaitingReceipt(32, "配送中", 33),
    OrderRefused(32, "订单拒收", 35),
    MoneyReceipt(32, "配送员已收款", 34),
    OrderCompleted(64, "订单妥投", 64),
    DeliveryConfirm(64, "配送员已交款", 65),
    SelfConfirm(64, "自提已收款", 65),
    PickupCompleted(64, "取件完成", 70),
    PickupFail(64, "取件失败", 71),
    PickupProcessed(64, "取件入站", 72),
    OrderCanceled(128, "取消订单", 135),
    RefuseProcessed(128, "拒收已入站", 133),
    RefuseStockReturn(128, "拒收已退库", 134),
    TransferHouseProduction(8, "转库房生产", 80),
    ProductingStop(128, "拣货终止", 131),
    OpCanceled(128, "运维取消", 130),
    SysCanceled(128, "系统取消(缺货)", 129),
    OpReCreateCancled(128, "修改订单", 132),
    Refused(128, "订单拒收", 128);

    private int key;
    private String value;
    private int code;

    private OrderStatusEnum(int key, String value, int code) {
        this.key = key;
        this.value = value;
        this.code = code;
    }

    public int getKey() {
        return this.key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public static String getValueByKey(int key) {
        OrderStatusEnum[] arr$ = values();
        int len$ = arr$.length;

        for(int i$ = 0; i$ < len$; ++i$) {
            OrderStatusEnum enums = arr$[i$];
            if (enums.getKey() == key) {
                return enums.getValue();
            }
        }

        return null;
    }

    public static Integer getKeyByValue(String value) {
        OrderStatusEnum[] arr$ = values();
        int len$ = arr$.length;

        for(int i$ = 0; i$ < len$; ++i$) {
            OrderStatusEnum enums = arr$[i$];
            if (enums.getValue().equals(value)) {
                return enums.getKey();
            }
        }

        return null;
    }

    public static Integer getKeyByCode(int code) {
        OrderStatusEnum[] arr$ = values();
        int len$ = arr$.length;

        for(int i$ = 0; i$ < len$; ++i$) {
            OrderStatusEnum enums = arr$[i$];
            if (enums.getCode() == code) {
                return enums.getKey();
            }
        }

        return null;
    }

    public static String getValueByCode(int code) {
        OrderStatusEnum[] arr$ = values();
        int len$ = arr$.length;

        for(int i$ = 0; i$ < len$; ++i$) {
            OrderStatusEnum enums = arr$[i$];
            if (enums.getCode() == code) {
                return enums.getValue();
            }
        }

        return null;
    }

    public static OrderStatusEnum getOrderStatusEnumByCode(int code) {
        OrderStatusEnum[] arr$ = values();
        int len$ = arr$.length;

        for(int i$ = 0; i$ < len$; ++i$) {
            OrderStatusEnum enums = arr$[i$];
            if (enums.getCode() == code) {
                return enums;
            }
        }

        return null;
    }

    public static Integer getCodeByKey(int key) {
        OrderStatusEnum[] arr$ = values();
        int len$ = arr$.length;

        for(int i$ = 0; i$ < len$; ++i$) {
            OrderStatusEnum enums = arr$[i$];
            if (enums.getKey() == key) {
                return enums.getCode();
            }
        }

        return null;
    }
}
