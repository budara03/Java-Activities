package EX02;

public class Feet {
	   private int feet;
	    private int inches;

	    // Constructor to initialize feet and inches
	    public Feet(int feet, int inches) {
	        this.feet = feet;
	        this.inches = inches;
	        normalize(); // Ensure that inches are between 0 and 11
	    }

	    // Overloaded constructor to accept another Feet object
	    public Feet(Feet len) {
	        this.feet = len.feet;
	        this.inches = len.inches;
	    }

	    // Method to add two Feet objects and store the result in the current object
	    public void add(Feet f1, Feet f2) {
	        this.feet = f1.feet + f2.feet;
	        this.inches = f1.inches + f2.inches;
	        normalize(); // Normalize after addition
	    }

	    // Overloaded method to add the current object with another Feet object
	    public void add(Feet f1) {
	        this.feet += f1.feet;
	        this.inches += f1.inches;
	        normalize();
	    }

	    // Method to normalize the inches (convert 12 inches to 1 foot)
	    private void normalize() {
	        if (this.inches >= 12) {
	            this.feet += this.inches / 12;
	            this.inches = this.inches % 12;
	        }
	    }

	    // Method to display the length in the format 5'6"
	    public void print() {
	        System.out.println(feet + "’" + inches + "”");
	    }

	    // Overloaded print method to display a message before the length
	    public void print(String msg) {
	        System.out.println(msg + feet + "’" + inches + "”");
	    }

	    // Static method to print any Feet object
	    public static void print(Feet f) {
	        System.out.println(f.feet + "’" + f.inches + "”");
	    }

	    // Static method to add three Feet objects and return a new Feet object
	    public static Feet add(Feet f1, Feet f2, Feet f3) {
	        Feet result = new Feet(f1.feet + f2.feet + f3.feet, f1.inches + f2.inches + f3.inches);
	        result.normalize();
	        return result;
	    }
}
