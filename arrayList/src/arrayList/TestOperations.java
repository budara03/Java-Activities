package arrayList;
import java.util.ArrayList;
import java.util.Scanner;
public class TestOperations {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		 Scanner s1 = new Scanner(System.in); {
			for(int i = 0 ; i <5 ;i++) {
				 System.out.print("Enter a Integer Number");
				 int Num = s1.nextInt();
				 numbers.add(Num);
			 }
		}
		 
		 System.out.print("Input-> " + numbers);
		 
		 ArrayListOperations.removeOddNumbers(new ArrayList<>(numbers));
		 ArrayListOperations.doubleEvenNumbers(new ArrayList<>(numbers));

	}

}
