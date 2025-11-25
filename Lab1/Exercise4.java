import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the value of the day
        System.out.print("Enter the value of the day (1-7): ");
        int dayValue = scanner.nextInt();
        
        // Display the day of the week based on the value
        switch (dayValue) {
            case 1:
                System.out.println("Day of the week: Monday");
                break;
            case 2:
                System.out.println("Day of the week: Tuesday");
                break;
            case 3:
                System.out.println("Day of the week: Wednesday");
                break;
            case 4:
                System.out.println("Day of the week: Thursday");
                break;
            case 5:
                System.out.println("Day of the week: Friday");
                break;
            case 6:
                System.out.println("Day of the week: Saturday");
                break;
            case 7:
                System.out.println("Day of the week: Sunday");
                break;
            default:
                System.out.println("Invalid Day");
        }
        
        // Display the goodbye message
        System.out.println("Good Bye!");
        
        // Close the scanner
        scanner.close();
    }
}
