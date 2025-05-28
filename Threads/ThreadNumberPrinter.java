
package Threads;

import java.util.Scanner;

public class ThreadNumberPrinter {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number limit for thread 2 (odd numbers):");
        int j = scan.nextInt();

        EvenNumber even = new EvenNumber();
        OddNumber odd = new OddNumber(j);

        even.start();
        odd.start();

        try {
            even.join();
            odd.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        scan.close();
    }
}

class EvenNumber extends Thread {

    public void run() {
        for (int i = 0; i < 500; i++) {
            if (i % 2 == 0) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
                System.out.println("Thread 1 (Even): " + i);
            }
        }
    }
}

class OddNumber extends Thread {
    int j;

 
    OddNumber(int j) {
        this.j = j;
    }

    public void run() {
        for (int i = 0; i < j; i++) {
            if (i % 2 != 0) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
                System.out.println("Thread 2 (Odd): " + i);
            }
        }
    }
}
