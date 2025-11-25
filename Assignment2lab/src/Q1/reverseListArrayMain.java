package Q1;
import java.util.ArrayList;
import java.util.Scanner;
public class reverseListArrayMain {

	public static void main(String[] args) {
		Scanner S1 = new Scanner(System.in);

		ArrayList<String> Fruits = new ArrayList<>();
		for(int i = 0 ;i<5;i++) {
        	System.out.println("Enter a Fruit");
        	String f1 = S1.next();
        	Fruits.add(f1);

	}
    System.out.println(Fruits);
    reverseListArray.reverseList(new ArrayList<>(Fruits));
    }
}
