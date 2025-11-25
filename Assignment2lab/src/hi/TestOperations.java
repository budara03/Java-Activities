package hi;
import java.util.*;
public class TestOperations {

	public static void main(String[] args) {
		Scanner S1 = new Scanner (System.in);
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		int num;
		for(int i =0; i<5 ;i++) {
			System.out.println("Enter the number :");
			num = S1.nextInt();
			numbers.add(num);
		}
		
		System.out.println(numbers);
		
		ArrayListOperations.removeOddNumbers(new ArrayList<>(numbers));
		ArrayListOperations.doubleEvenNumbers(new ArrayList<>(numbers));
	}

}
