package myThread.i09;

public class SellTicket implements Runnable {
    private static int i = 100;
    private Object obj = new Object();
    private int s = 0;

    @Override
    public void run() {
        while (true) {
            if (s % 2 == 0) {
                synchronized (SellTicket.class) {
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
            } else {
                sellTicket();
            }
            s++;
        }
    }

    private static synchronized void sellTicket() {
        if (i > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "卖出了第" + i + "张票");
            i--;
        }
    }
}

