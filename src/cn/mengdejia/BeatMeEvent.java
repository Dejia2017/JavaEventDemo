package cn.mengdejia;

import java.util.EventObject;

/**
 * @Author: Dejia Meng
 * @Date: 2019-11-15 17:35
 * 有人打我事件
 */
public class BeatMeEvent extends EventObject {

    /**
     * 封装了事件源
     */
    private Object source;

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public BeatMeEvent(Object source) {
        super(source);
        this.source = source;
    }

    @Override
    public Object getSource() {
        return this.source;
    }

    public void setSource(Object source) {
        this.source = source;
    }
}
