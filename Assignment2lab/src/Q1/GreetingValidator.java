package Q1;
import java.util.Scanner;


class InvalidInputException extends Exception{
	public InvalidInputException(String message) {
		 super(message);
		 }
}
public class GreetingValidator {

	public static void main(String[] args) {
		
		Scanner S1 = new Scanner (System.in);
     
		System.out.print("Enter the Name :");
		String Name = S1.next();
		
		int Age = 0 ;
		boolean isValidAge = false;
		while(!isValidAge)
		{
			try {
				 System.out.print("Enter the Age :");
				 Age = Integer.parseInt(S1.nextLine());
				 
				 if(Age<=0||Age>120) {
					 throw new InvalidInputException("Invalid age: Age should be a positive integer less than or equal to 120");
				 }
				 isValidAge=true ;

			}
			catch (NumberFormatException e){
				System.out.println("Invalid age format. Please enter a valid positive integer.");
			}  catch (InvalidInputException e) {
				 System.out.println(e.getMessage());
		
		}
		
	}
		System.out.println("Hello, " + Name + "! You are " + Age + " years old.");
}
	
}
