import java.util.Scanner;

class EvenOddNumber {
    public boolean findEvenOrOdd(int i) {
        return i % 2 == 0;
    }
}

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EvenOddNumber evenOddNumber = new EvenOddNumber();

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        boolean isEven = evenOddNumber.findEvenOrOdd(number);
        String result = isEven ? "even" : "odd";
        System.out.println(number + " is an " + result + " number.");

        scanner.close();
    }
}
