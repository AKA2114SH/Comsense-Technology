package multithreading;
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        ThreadExample t1 = new ThreadExample();
        t1.start();
        MyThread t2 = new MyThread();
        t2.run();
        
    }

	public void start() {
		System.out.println("Started");
		
	}
}
