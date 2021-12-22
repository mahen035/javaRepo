package com.training.mars;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int[] myArray = new int[10];
		
		int[][] twoDArray = new int[3][4];
		
		String name = "Dave";      // String literal
		
		String newName = name.concat(" Miller");
		
		System.out.println(name);
		
		System.out.println(newName);
		
		//String name1 = new String("Dave"); // String object
		
		//System.out.println(name==newName);
		
		
		
		//  2[0,0]	3[0,1]	4[0,2]	6[0,3]
		//  1[1,0]	8[1,1]	7[1,2]	9[1,3]
		//  5[2,0]	3[2,1]	2[2,2]	6[2,3]
		
	//	System.out.println("Length of array: "+twoDArray[0].length);
				
	/*
	 * for(int i = 0 ; i < twoDArray.length; i++) { for(int j = 0; j <
	 * twoDArray[0].length; j++ ) { twoDArray[i][j] = i+j; }
	 * 
	 * } System.out.println("Displaying Two dimensional array"); for(int i = 0 ; i <
	 * twoDArray.length; i++) { for(int j = 0; j < twoDArray[0].length; j++) {
	 * System.out.print(twoDArray[i][j]+" "); } System.out.println();
	 * 
	 * }
	 */
		  
		  
		 for(int i = 1; i<=3 ;i++) {
			 for(int j = 1 ; j<=i ; j++) {
				 System.out.print(j);
			 }
			 System.out.println();
		 }
		 		
		
			/*
			 * for(int i = 0 ; i < myArray.length; i++) { myArray[i] = i*2; }
			 * 
			 * 
			 * for(int j = 0 ; j < myArray.length; j++) { System.out.println(myArray[j]); }
			 */
		
		/*
		 * for(int number:myArray) { System.out.println(number); }
		 */
		
		
		
	}

}
