package myThread.i02;

/*
    Thread类中获取和设置线程名称的方法
        void setName(String name)：将此线程的名称更改为等于参数 name
        String getName()：返回此线程的名称
 */
public class MyThreadDemo {
    public static void main(String[] args) {
//        MyThread my1 = new MyThread();
//        MyThread my2 = new MyThread();

//        my1.setName("走路");
//        my2.setName("骑车");
//        MyThread my1 = new MyThread("走路");
//        MyThread my2 = new MyThread("骑车");

//        my1.start();
//        my2.start();
        //static Thread currentThread() 返回对当前正在执行的线程对象的引用
        System.out.println(MyThread.currentThread().getName());
    }
}
