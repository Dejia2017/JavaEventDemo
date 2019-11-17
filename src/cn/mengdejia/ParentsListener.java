package cn.mengdejia;

import java.util.EventListener;

/**
 * @Author: Dejia Meng
 * @Date: 2019-11-15 17:38
 */
public class ParentsListener implements EventListener {
    public void response(BeatMeEvent beatMeEvent) {
        // 这里的事件代表一个实例
        MyChild myChild = (MyChild) beatMeEvent.getSource();
        System.out.println("孩子的状态是正在被打 status=" + myChild.getStatus());
    }
}
