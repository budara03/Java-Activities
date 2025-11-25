package Q1;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListSummain {

	public static void main(String[] args) {
		Scanner S1 = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<>();
		
		for(int i = 0 ;i<5;i++) {
        	System.out.println("Enter a number");
        	int num = S1.nextInt();
        	numbers.add(num);
        }
		ArrayListSum.sumElements(new ArrayList<>(numbers));
	}

}
