package myThread.i05;
/*
    方式2：实现Runnable接口
        1:定义一个类MyRunnable实现Runnable接口
        2:在MyRunnable类中重写run()方法
        3:创建MyRunnable类的对象
        4:创建Thread类的对象，把MyRunnable对象作为构造方法的参数
        5:启动线程
 */
public class MyRunnableDemo {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();

        Thread t1 = new Thread(mr,"飞机");
        Thread t2 = new Thread(mr,"火车");

        t1.start();
        t2.start();
    }
}
