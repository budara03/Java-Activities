package hi;
import java.util.ArrayList;
public class ArrayListOperations {

	public static void removeOddNumbers (ArrayList<Integer>numbers) {
		numbers.removeIf(n-> n%2 !=0);
			System.out.println(numbers);
		}
	public static void doubleEvenNumbers (ArrayList<Integer>numbers) {
		ArrayList<Integer> newnumbers = new ArrayList <Integer> ();
		int dob;
		for(int num :numbers) {
			if(num %2 == 0) {
				 dob = num *2;
				newnumbers.add(dob);
				
			}
				
		}
		System.out.println(newnumbers);
	}
}

