import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        // Declare two integer variables
        int num1, num2;
        
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the first integer
        System.out.print("Enter the first integer: ");
        num1 = scanner.nextInt();

        // Prompt user to enter the second integer
        System.out.print("Enter the second integer: ");
        num2 = scanner.nextInt();

        // Calculate the sum
        int sum = num1 + num2;

        // Calculate the average
        double average = sum / 2.0;

        // Display the sum and average
        System.out.println("The sum of the two integers is: " + sum);
        System.out.println("The average of the two integers is: " + average);
        
        // Close the scanner
        scanner.close();
    }
}
