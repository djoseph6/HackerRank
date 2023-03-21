package OCAJP8_Practice;

import java.util.Arrays;
import java.util.Collections;

public class ArrayManipulation {
	
	static int a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	char [] charArray = new char[++a];
		
	//	charArray[0] = 22;       //No Compilation issue
		
		//System.out.println(charArray[0]);

		
		int[] intArray = {1,2,3};
		
		int[][] intArray2 = {{1,2}, {1,2}};
		
//	for(int a=0; a<intArray2.length; a++) {
//		System.out.println();
//		System.out.print(a+": ");
//		for(int b=0; b<intArray2[a].length; b++) {
//			System.out.print(intArray2[a][b]+", ");
//			}
//		}
	
	int[][][] intArray3 = {{{1,2,3}, {1,2,3}, {1,2,3}}, {{1,2,3}, {1,2,3}}, {{1,2,3}, {1,2,3}}};
			
//	for(int a=0; a<intArray3.length; a++) {
//		System.out.println();
//		System.out.print(a+": ");
//		for(int b=0; b<intArray3[a].length; b++) {
//			System.out.println("        ");
//			System.out.print(b+" -{");
//			for(int c=0;c<intArray3[a][b].length; c++) {
//				System.out.print(intArray3[a][b][c]+",");
//				
//			}
//			System.out.print("}");
//			
//			}
//		}
	
	int[][] arr = new int[2][];
	
	System.out.println(arr.length);
		try {
			System.out.println(arr[0].length);  
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			arr[0][1] = 21;
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	arr[0] = new int[2];
	try {
		System.out.println(arr[0].length);
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[0][2]);
	} catch(Exception e) {
		System.out.println(e.getMessage());
	}
	
	Arrays.sort(arr, 1, 2);
	
	int[] intArray0 = {1,2,3};
	
	System.out.println(Arrays.equals(intArray, intArray0));
	System.out.println(Arrays.deepEquals(intArray2, intArray3));
	
	
	String[] stg = new String[3];
	
	try{
		System.out.println(stg[1].length());
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
	}
	
	}
	
	

}
