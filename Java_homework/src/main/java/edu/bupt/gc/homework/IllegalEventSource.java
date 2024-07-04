package edu.bupt.gc.homework;

public interface IllegalEventSource {
    /**
     * 事件源收到非法攻击的时候，用于实现事件的委托，
     * 通过此接口事件源可以把事件委托给实现了IllegalEventListener接口
     * 的对象进行处理
     * @param eventListener
     */
    void addIllegalEventListener(IllegalEventListener eventListener);

    /**
     * 激活事件，当事件源被攻击的时候，事件源要主动激活事件
     * @param illegalEvent
     */
    void fireIllegalEvent(IllegalEvent illegalEvent);
}
