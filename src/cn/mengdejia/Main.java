package cn.mengdejia;

/**
 * @Author: Dejia Meng
 * @Date: 2019-11-15 17:34
 *
 * https://blog.csdn.net/weixin_41717940/article/details/80793999 仿写博客
 */
public class Main {
    public static void main(String[] args) {
        // 事件源
        MyChild myChild = new MyChild();
        // 在事件源注册监听器
        myChild.addListener(new ParentsListener() {
            /**
             * 触发监听器执行的函数
             * @param beatMeEvent
             */
            @Override
            public void response(BeatMeEvent beatMeEvent) {
                super.response(beatMeEvent);
            }
        });
        System.out.println("有人正在打你的儿子！");
        // 事件源上的一个方法，用于对事件源的操作，同时通知到了事件的监听器。执行监听器的相应方法。
        myChild.beingBeat();

    }
}
