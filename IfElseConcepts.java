package JavaBasics;

public class IfElseConcepts {

	public static void main(String[] args) {
		
		int a = 600;
		int b = 300;
		
		if(b>a) {
			System.out.println("b is greater than a");
		}
		else {
			System.out.println("a is greater than b");
		}
		// Comparision Operator
		int c = 30;
		int d = 40;
		
		if(c==d) {
			System.out.println("c and d are equal");
		}
		else {
			System.out.println("c and d are not equal");
		}
		// Logic to find out the highest number
		
	    int	a1 = 100;
		int b1= 200;
		int c1 = 300;
		
		// nested if else
		
		if(a1>b1 & a1>c1) {
			System.out.println("a1 is greatest");
			}
		else if (b1>c1) {
			System.out.println("b1 is greatest");
		}
		else {
			System.out.println("c1 is greatest");
		}
		//
		int	a2 = 400;
		int b2= 500;
		int c2 = 300;
		
		if(a2>b2 & a2>c2) {
			System.out.println("a2 is greatest");
			}
		else if (b2>c2) {
			System.out.println("b2 is greatest");
		}
		else {
			System.out.println("c2 is greatest");
		}
		
	}

}
