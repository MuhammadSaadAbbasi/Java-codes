package ExceptionHandling1;

import java.io.*;

public class multiException {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] b = new int[5];  // array of size 5
        int[] a;

        try {
            System.out.print("Enter any number (less than or equal to 4): ");
            String s = br.readLine();
            int i = Integer.parseInt(s); // converting input to int

            // First risky block
            try {
                if (i == 1) {
                    int k = i / (i - 1); // Division by zero when i == 1
                }
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic Exception: " + e.getMessage());
            }

            // Second risky block
            try {
                if (i == 2) {
                    a = new int[i-3];
                }

                if (i == 3) {
                    i = i / (i - 3); // Division by zero when i == 3
                }

                if (i == 4) {
                	
                	b[i] = 500;
               
                }

                if (i == 5) {
                    b[10] = 500; // Out of bounds
                }

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array Index Out Of Bounds: " + e.getMessage());
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic Exception (second block): " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Number Format Exception: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("General Exception: " + e.getMessage());
        }
    }
}
