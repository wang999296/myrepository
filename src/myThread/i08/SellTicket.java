package myThread.i08;

public class SellTicket implements Runnable {
    private int i = 100;
    private Object obj = new Object();
    @Override
    public void run() {
        while (true) {
            synchronized (obj) {
                if (i > 0) {
                    System.out.println(Thread.currentThread().getName() + "卖出了第" + i + "张票");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    i--;
                }
            }
        }
    }
}

