package oopsconcept;

public class Functions {
// main method is starting point of execution
	public static void main(String[] args) {
		
		Functions obj= new Functions(); 
		// after creating the object, the copy of non static methods will be given to this object
		
		obj.test();
		
	    int l= obj.test1();
	    System.out.println(l);
	    
	    String s1= obj.qa();
	    System.out.println(s1);
	    
		int l1= obj.division(20, 10);
		System.out.println(l1);
		
		// main method always have void type and will never returns a value
   // non static methods/functions
		
			}
	// void does not return any value
	public void test() { // no input and no output
		System.out.println("test method");
	}
	
	// test1 method is returning value of type int
    public int test1() { // no input , some output
    	System.out.println("test1 method");
    	
    	int a= 10;
    	int b= 20;
    	int c= 30;
    	
    	return c;
    }
    public String qa() { //no input, some output
    	System.out.println("qa method");
    	String s= "Selenium";
    	
    	return s;
    	
    }
    // x and y are input parameters/arguments
     public int division(int x, int y) {
    	 System.out.println("division method");
    	 int d= x/y;
    	 return d;
     }
}
