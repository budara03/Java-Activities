import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class VolumeCalculator2 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter the length of the cube: ");
            double length = Double.parseDouble(reader.readLine());

            System.out.print("Enter the width of the cube: ");
            double width = Double.parseDouble(reader.readLine());

            System.out.print("Enter the height of the cube: ");
            double height = Double.parseDouble(reader.readLine());

            double volume = length * width * height;

            System.out.println("The volume of the cube is: " + volume);
        } catch (IOException e) {
            System.out.println("An error occurred while reading input: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter numerical values.");
        }
    }
}
