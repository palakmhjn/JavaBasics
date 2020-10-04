package JavaBasics;

public class TwoDimensionalArray {

	public static void main(String[] args) {
	
		String x[][] = new String[2][5];
		System.out.println(x.length); // will give total number of rows
		System.out.println(x[0].length); // total number of columns
		
		x[0][0]= "Palak";
		x[0][1]= "mahajan";
		x[0][2]= "28";
		x[0][3]= "Jammu";
		x[0][4]= "Integrichain";
		
		x[1][0]= "Palak";
		x[1][1]= "mahajan";
		x[1][2]= "28";
		x[1][3]= "Jammu";
		x[1][4]= "Integrichain";
		
		
	//	System.out.println(x[1][2]);
		
		// print all values of 2-D Array
		int row;
		int column;
		for ( row=0;row<x.length;row++);
		for(column=0;column<x[0].length;column++);
		System.out.println(x[row][column]);
	}

}
		

	


