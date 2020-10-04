package oopsconcept;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading obj= new MethodOverloading();
		
		obj.sum();
		obj.sum(10);
		obj.sum(10, 20);
		}
	
	public void sum() { // no parameters
		System.out.println("sum method--zero param");
	}
    public void sum(int i) {
    	System.out.println("sum method--one param");
    }
    public void sum(int j, int k) {
    	System.out.println("sum method--two param");
    	System.out.println(j+k);
    }
}
