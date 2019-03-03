package com.dmall.delivery.service;

import com.dmall.delivery.common.vo.DeliveryBaseVO;
import com.dmall.delivery.common.vo.DeliveryTaskVO;

public class DeliveryTaskService {

    public DeliveryTaskVO queryTaskById(String orderId){
        return new DeliveryTaskVO();
    }

    public boolean insert(DeliveryBaseVO deliveryBaseVO){
        return true;
    }
}
