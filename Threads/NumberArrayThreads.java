
package Threads;

public class NumberArrayThreads {

    public static void main(String[] args) {
        int[] arr1 = new int[500];
        int[] arr2 = new int[500];

        EvenNumberThread t1 = new EvenNumberThread(arr1);
        OddNumberThread t2 = new OddNumberThread(arr2);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted while waiting for threads to finish.");
        }

        System.out.println("Printing thread 1 (Even Numbers):");
        t1.printArray();

        System.out.println("Printing thread 2 (Odd Numbers):");
        t2.printArray();
    }
}

class EvenNumberThread extends Thread {
    int[] arr;

    EvenNumberThread(int[] arr) {
        this.arr = arr;
    }

    public void run() {
        for (int i = 1001, j = 0; i <= 2000; i++) {
            if (i % 2 == 0) {
                try {
                    System.out.println("Thread 1 - Even: " + i);
                    arr[j] = i;
                    j++;
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    void printArray() {
        for (int i : arr) {
            System.out.println(i);
        }
    }
}

class OddNumberThread extends Thread {
    int[] arr;

    OddNumberThread(int[] arr) {
        this.arr = arr;
    }

    public void run() {
        for (int i = 1001, j = 0; i <= 2000; i++) {
            if (i % 2 != 0) {
                try {
                    System.out.println("Thread 2 - Odd: " + i);
                    arr[j] = i;
                    j++;
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    void printArray() {
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
