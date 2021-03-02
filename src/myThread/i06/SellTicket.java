package myThread.i06;

public class SellTicket implements Runnable {
    private int i =100;
    public void run() {
        while (true){
           if ( i > 0 ){
                System.out.println(Thread.currentThread().getName()+"卖出了第"+i+"张票");

                i--;
            }
        }
    }
}
