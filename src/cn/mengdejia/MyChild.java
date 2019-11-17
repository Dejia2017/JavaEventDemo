package cn.mengdejia;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: Dejia Meng
 * @Date: 2019-11-15 17:39
 * 事件源
 */
public class MyChild {
    private List<ParentsListener> parentsListeners;
    /**
     * 0 健康 1 被打
     */
    private byte status;

    public MyChild() {
        this.parentsListeners = new ArrayList<>();
        this.status = 0;
    }

    public void addListener(ParentsListener parentsListener) {
        this.parentsListeners.add(parentsListener);
    }

    public void notifies() {
        Iterator<ParentsListener> iterable = parentsListeners.iterator();
        while (iterable.hasNext()) {
            ParentsListener parentsListener = iterable.next();
            // 根据源的类型创建一个对象
            parentsListener.response(new BeatMeEvent(this));
        }
    }

    public void beingBeat() {
        this.status = 1;
        notifies();
    }

    public byte getStatus() {
        return this.status;
    }

}
