package oopsconcept;

public class ClassObject {
	
	// Global vriables
	// Class variables
	
	String name;
	int age;
	

	public static void main(String[] args) {
		
		// new ClassObject --- is the object of class ClassObject
		// a and b are object reference variables, representing the objects
		// new keyword is used to create the object
		
		
		ClassObject a= new ClassObject();
		ClassObject b= new ClassObject();
		
		a.name= "Palak";
		a.age= 28;
		
		b.name= "ABC";
		b.age= 26;
		
		System.out.println(a.name);
		System.out.println(a.age);
		System.out.println(b.name);
		System.out.println(b.age);
		
		
	}

}
