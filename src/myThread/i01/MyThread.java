package myThread.i01;
//1:定义一个类MyThread继承Thread类
public class MyThread extends Thread {
//    2:在MyThread类中重写run()方法
    @Override
    public void run() {
        for (int i = 0;i<100;i++){
            System.out.println(i);
        }
    }
}
