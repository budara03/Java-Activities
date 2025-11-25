package hi;
import java.util.*; 
public class StringObjectives {
	public static String ReverseString (String input) {
		   Stack<Character> stack = new Stack<>();
		   char [] arr = input.toCharArray();
		   for(int i = 0 ;i<arr.length;i++){
		       stack.push(arr[i]);
		   }
		   stringBuilder reversed = new stringBuilder();
		   while(!stack.isEmpty()){
		   reversed.append(stack.pop());
		   }
		   return reversed.toString();
		   
	   }
	   public  int countVowels(String input) {
	       input =input.toLowerCase();
		   int count=0;
		   
		   for (char c :input.toCharArray()) {
			   if(c=='a'||c== 'e' || c == 'i' || c == 'o' || c == 'u')
			   {
				   count++;
			   }
		   }
		return count;
	   }
	 }
}
