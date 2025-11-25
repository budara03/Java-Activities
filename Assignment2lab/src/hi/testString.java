package hi;
import java.util.*; 
public class testString {

	public static void main(String[] args) {
     Scanner S1 = new Scanner (System.in);												
     System.out.println("Enter the name");
     String name = S1.next();
     
    String reversed = StringObjectives.ReverseString(name);
     int count =    StringObjectives.countVowels(name);
     
     System.out.println(reversed);
     System.out.println(count);
	}

}
