
package Threads;

public class ThreadsDemo {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();

        System.out.println("Main thread class: " + mainThread.getClass());
        System.out.println("Main thread name: " + mainThread.getName());

        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start();
        t2.start();

        try {
            Thread.sleep(3000); // Main thread sleeps 3 seconds
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted while sleeping.");
        }

        // Interrupt Thread1 after 3 seconds
        t1.interrupt();

        System.out.println("Main thread exiting.");
    }
}

class Thread1 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Inside Thread 1 = " + i);

            if (i % 2 != 0) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Thread 1 is Interrupted");
                    return; // Optionally exit early after interruption
                }
            }
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Inside Thread 2 = " + i);

            if (i % 2 == 0) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Thread 2 is Interrupted");
                }
            }
        }
    }
}
