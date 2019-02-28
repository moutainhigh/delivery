package com.dmall.delivery.state;

/**
 * State
 *
 * @author junyuan.chen
 * @date 19-2-28
 */
public interface State {

    /**
     * 上一个状态机
     */
    State before(State state);

    /**
     * 下一个状态机
     */
    State after(State state);

    /**
     * 是否已经更改状态
     * @return
     */
    boolean isChangeState();

    /**
     * 每个State实现各自实现状态扭转的方法
     * @return
     */
    State changeState();
}
