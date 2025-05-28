package ExceptionHandling1;

public class UserRegistration1 {
    public void register(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be at least 18.");
        }
        System.out.println("User registered successfully.");
    }

    public static void main(String[] args) {
        UserRegistration1 ur = new UserRegistration1();
        try {
            ur.register(16);
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

