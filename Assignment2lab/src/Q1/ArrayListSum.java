
//Create a method called sumElements inside a class named ArrayListUtils. 
//This method should take an ArrayList of integers and return the sum of all elements in the list.
package Q1;
import java.util.ArrayList;
public class ArrayListSum {
	public static void sumElements (ArrayList<Integer>numbers) {
		int sum = 0;
		for(int num :numbers) {
			sum+=num;
		}
		System.out.println("SUM ="+sum);
	}
	
  
} 
