package Q1;
import java.util.ArrayList;

public class ArrayListUtils {
	public static void findMax(ArrayList<Integer>numbers) {

		int max = 0;
		for(int num : numbers) {
		if (num > max) {

		max = num;
		}

		}

		System.out.println(max);
}
}
