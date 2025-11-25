package hi;

public class Student {
    int id ;
    String name;
    int Mark;
   public Student() {
	   id = 0;
	   name ="";
	   Mark = 0;
   }
   public Student(int id ,String name,int Mark) {
	   this.id = id;
	   this.name =name;
	   this.Mark = Mark;
   }
   public void Display() {
		 System.out.println("id = " +this.id);
		 System.out.println("Name = " +this.name);
		 System.out.println("Marks = " +this.Mark);
		 System.out.println();
	 }
public int getMark() {
	return Mark;
}
public String toString() {
    return "ID: " + id + ", Name: " + name + ", Mark: " + Mark;
}
   
}
