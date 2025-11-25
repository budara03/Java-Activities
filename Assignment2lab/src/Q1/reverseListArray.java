package Q1;
import java.util.ArrayList;
import java.util.Collections;
public class reverseListArray {

	public static void reverseList (ArrayList<String>Fruits) {
		ArrayList<String> reverseArray = new ArrayList<>(Fruits);
		
		Collections.reverse(reverseArray);
		System.out.println(reverseArray);
	}
}

