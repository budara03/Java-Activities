class EvenOddNumber {
    public boolean findEvenOrOdd(int i) {
        return i % 2 == 0;
    }
}

public class Demo {
    public static void main(String[] args) {
        EvenOddNumber evenOddNumber = new EvenOddNumber();

        int[] numbers = {10, 15, 22, 35, 40};

        for (int number : numbers) {
            boolean isEven = evenOddNumber.findEvenOrOdd(number);
            if (isEven) {
                System.out.println(number + " is an even number.");
            } else {
                System.out.println(number + " is an odd number.");
            }
        }
    }
}
