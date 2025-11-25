package Q1;
import java.util.Scanner;

//Custom exception for invalid number of digits
class InvalidPhoneNumberDigits extends Exception {
 public InvalidPhoneNumberDigits(String message) {
     super(message);
 }
}

//Custom exception for invalid starting digit
class InvalidPhoneNumberStart extends Exception {
 public InvalidPhoneNumberStart(String message) {
     super(message);
 }
}

public class GreetingValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get user inputs
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        // Validate the input
        try {
            validateAge(age);
            // If valid, print the greeting message
            System.out.println("Hello, " + name + "! You are " + age + " years old.");
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }

    // Method to validate age
    public static void validateAge(int age) throws InvalidInputException {
        if (age <= 0 || age > 120) {
            throw new InvalidInputException("Invalid age: Age should be a positive integer less than or equal to 120.");
        }
    }
}
