public class Marathon {
 public static void main (String [] args ) {
 
 int miles,yards;
 double kilomerers;
 
 miles = 26;
 yards = 385;
 
kilomerers  = miles * 1.609 + (yards / 1760.0) * 1.609;

System.out.println("The distance of a marathon in kilometers is: " + kilomerers);
 
 
 }
}
