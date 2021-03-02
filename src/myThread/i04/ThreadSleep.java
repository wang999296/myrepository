package myThread.i04;


public class ThreadSleep extends Thread {
    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + ":" + i);
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
