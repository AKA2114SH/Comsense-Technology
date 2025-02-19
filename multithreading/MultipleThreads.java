package multithreading;

class MyThreadex extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running...");
    }
}

public class MultipleThreads {
    public static void main(String[] args) {
        MyThreadex t1 = new MyThreadex();
        MyThreadex t2 = new MyThreadex();

        t1.start();
        t2.start();
    }
}
