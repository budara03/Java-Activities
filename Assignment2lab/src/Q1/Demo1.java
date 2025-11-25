package Q1;
import java.util.ArrayList;
import java.util.Scanner;
public class Demo1 {

	public static void main(String[] args) {
		ArrayList<Integer>numbers= new ArrayList<>();
        Scanner S1 = new Scanner(System.in);
        
        for(int i = 0 ;i<5;i++) {
        	System.out.println("Enter a number");
        	int num = S1.nextInt();
        	numbers.add(num);
        }
        
		ArrayListUtils.findMax(new ArrayList<>(numbers));


	}

}
//Create a method called sumElements inside a class named ArrayListUtils. 
//This method should take an ArrayList of integers and return the sum of all elements in the list.