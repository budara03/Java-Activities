package EX02;

public class FeetApp {

	public static void main(String[] args) {
		 // Testing constructors and print methods
        Feet myLength = new Feet(5, 6);
        myLength.print(); // Should print 5'6"
        myLength.print("Length: "); // Should print Length: 5'6"

        // Testing overloaded constructor
        Feet newLength = new Feet(myLength);
        newLength.print("Copied Length: "); // Should print Copied Length: 5'6"

        // Testing add method with two Feet objects
        Feet anotherLength = new Feet(6, 7);
        myLength.add(newLength, anotherLength);
        myLength.print(); // Should print 12'1"

        // Testing add method with current object
        myLength.add(newLength);
        myLength.print(); // Should print 17'7"

        // Testing static print method
        Feet.print(newLength); // Should print 5'6"

        // Testing static add method for three Feet objects
        Feet f1 = new Feet(2, 8);
        Feet f2 = new Feet(3, 11);
        Feet f3 = new Feet(1, 4);
        Feet f5 = Feet.add(f1, f2, f3);
        f5.print(); // Should print 8'11"

	}

}
