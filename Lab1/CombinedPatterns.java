public class CombinedPatterns {
    public static void main(String[] args) {
        int rows = 5;
        int columns = 5;

        for (int i = 0; i < rows; i++) {
            // Print the first pattern (square)
            for (int j = 0; j < columns; j++) {
                System.out.print("* ");
            }
            
            // Print spaces between the patterns
            System.out.print("    ");
            
            // Print leading spaces for the second pattern (triangle)
            for (int j = i; j < rows - 1; j++) {
                System.out.print(" ");
            }
            // Print stars for the second pattern (triangle)
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
