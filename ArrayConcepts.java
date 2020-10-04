package JavaBasics;

public class ArrayConcepts {

	public static void main(String[] args) {
		
		// Array is used to store similar data types values in a array variable
		
		// int array;
		// One Dimensional Array
		// dis advantages of Array:- Size is fixed called static array, to overcome this problem we use collections--Arraylist--Hashtable--dynamic array
		// 2. store similar data type -- to overcome this problem,we use object array
		
		int i[] = new int[4];
		 i[0] = 10;
		 i[1] = 20;
		 i[2] = 30;
		 i[3] = 40;
		// System.out.println(i[2]);
		 
		 //System.out.println(i[4]); // ArrayIndexOutOfBoundsException
		 
		 System.out.println(i.length);  // size or length of Array
		 
		 // Print all the values of Array 
		 
		 
	/*	 for(int j1=0; j1< i.length;j1++);
		 System.out.println(i[j1]);
	} */
		 
		 // Char Arrar
		 char c[]= new char[3];
		 c[0]='a';
		 c[1]='b';
		 c[2]='c';
		 
		 System.out.println(c[2]);
		 
		 // String Array
		 String s[]= new String[3];
		 s[0]= "Hello";
		 s[1]= "Palak";
		 s[2]= "Mahajan";
		 System.out.println(s[1]);
		 
		 //Object Array (Object is a class) is used to store different data types values
		 
		 Object obj[]= new Object[3];
		 obj[0]= "Palak";
		 obj[1]= 28;
		 obj[2]= "Jammu";
		 
		 System.out.println(obj[2]);
		 System.out.println(obj.length);
	}
}
		
		 
		 
		
		

	


