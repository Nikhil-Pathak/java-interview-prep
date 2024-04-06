package multithreading;

import java.util.function.BiPredicate;

public class DeadLock {
    public static void main(String[] args) {
        final Object resorce1 = new Object();
        final Object resorce2 = new Object();


        Thread thread1 = new Thread(() -> {
            synchronized (resorce1) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (resorce2) {
                    System.out.println("Thread 1 Got Resource2");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (resorce2) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (resorce1) {
                    System.out.println("Thread 2 Got Resource1");
                }
            }
        });

        thread1.start();
        thread2.start();

    }
}
