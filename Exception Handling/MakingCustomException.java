package ExceptionHandling1;
import java.util.Scanner;

public class MakingCustomException{

    static class UnderAgeException extends Exception {
        public UnderAgeException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Username");
        try {
            String username = sc.nextLine();
            if (username.isEmpty()) {
                throw new IllegalArgumentException("Username cannot be empty.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Username entered");
        }

        System.out.println("Enter Email");
        try {
            String email = sc.nextLine();
            if (email.isEmpty()) {
                throw new IllegalArgumentException("Email cannot be empty.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Email entered");
        }

        System.out.println("Enter Age");
        try {
            int age = sc.nextInt();
            if (age < 18) {
                throw new UnderAgeException("Age must be 18 or older.");
            } else {
                System.out.println("Age accepted: " + age);
            }
        } catch (UnderAgeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input for age.");
        } finally {
            sc.close();
        }
    }
}
