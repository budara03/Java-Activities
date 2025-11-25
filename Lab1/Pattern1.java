public class Pattern1 {
    public static void main(String[] args) {
        int rows = 5;
        int columns = 5;

        int i = 0;
        while (i < rows) {
            int j = 0;
            while (j < columns) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
