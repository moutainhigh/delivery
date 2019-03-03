package com.dmall.delivery.state;

import com.dmall.delivery.common.vo.DeliveryBaseVO;

/**
 * State
 *
 * @author junyuan.chen
 * @date 19-2-28
 */
public interface State {

    /**
     * 下一个状态机
     */
    void doAction(DeliveryBaseVO deliveryBaseVO);

    /**
     * 是否已经更改状态
     * @return
     */
    boolean isChangeState();

    /**
     * 更改状态
     */

    void changeState();

}
