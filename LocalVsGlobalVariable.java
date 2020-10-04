package oopsconcept;

public class LocalVsGlobalVariable {
	
	//Global Variable
	
	String name= "Palak";
	int age= 28;

	public static void main(String[] args) {
		
		int i = 10; // local variable for main method
		System.out.println(i);
		
		LocalVsGlobalVariable obj= new LocalVsGlobalVariable();
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj.sum());
		}
	
	public void sum() {
		int i= 15; // local variable for method sum
		int j= 20;
		int age= 28;
	}

}
