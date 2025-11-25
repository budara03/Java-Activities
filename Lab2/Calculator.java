import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the cube: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the cube: ");
        double width = scanner.nextDouble();

        System.out.print("Enter the height of the cube: ");
        double height = scanner.nextDouble();

        double volume = length * width * height;

        System.out.println("The volume of the cube is: " + volume);
        
        scanner.close();
    }
}
