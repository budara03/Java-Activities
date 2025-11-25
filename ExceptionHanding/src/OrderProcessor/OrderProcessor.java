package OrderProcessor;

import java.util.Scanner;

public class OrderProcessor {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		
		try {
			System.out.println("Enter the Quantity of items in the order :");
			String  qty =s1.next();
			int qtuntyty = validatequntity(qty);
			System.out.println("Order is successfull ! " +qtuntyty +" Iterms");
		}catch(InsufficientQuantityException | QuantityOutOfRangeException |QuantityNotNumericException e ) {
			System.out.println(e.getMessage());
		}
	}

	private static int validatequntity(String qty)throws InsufficientQuantityException, QuantityOutOfRangeException ,QuantityNotNumericException   {
		if(!isNumeric(qty)) {
			throw new QuantityNotNumericException("Invalid input. Please enter a numeri quantity.");
		}
		int quntity =Integer.parseInt(qty);
		
		if(quntity<1) {
			throw new InsufficientQuantityException("Insufficient quantity. Please enter a quantity greater than 0.");
		}
		if(quntity>1000) {
			throw new QuantityOutOfRangeException("Quantity out of range. Quantity must be between 1 and 1000.");
		}
			
		return quntity;
	}
	private static boolean isNumeric(String str) {
		try {
			Integer.parseInt(str);
			return true;
		}catch (NumberFormatException e) {
			return false; 
		}
	}

}
