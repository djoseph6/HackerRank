package Easy;

import java.util.LinkedList;
import java.util.Queue;

public class DiagnalAddition {
	
	public static void main(String[] args) {
		
		//Create 2D array with numbers 1-9. It should look like a numberpad.
	
	int[][] numPad = new int [3][3];
	
	Queue<Integer> numList = new LinkedList<>(); 
	Integer[] nums = {1,2,3,4,5,6,7,8,9};
	
	for(Integer i: nums) {
		numList.add(i);
	}
	
	System.out.println(numList.peek());
	
	for(int x = 0; x<numPad.length; x++) {				//increment based on number of rows in numPad
		for(int y = 0; y<numPad[x].length;y++) {	//increment based on number of columns in rows in numPad
				numPad[x][y] = numList.poll();
			}
		}
	

	for(int x = 0; x<numPad.length; x++) {	//increment based on number of rows in numPad
		System.out.println();
		for(int y = 0; y<numPad[x].length;y++) {	//increment based on number of columns in rows in numPad
				System.out.print(numPad[x][y]+" ");
			}
		}

	
		// Create a method that adds the numbers that connected diagonally. Ex. 1+5+9 = 15. Then calculate the absolute value of both values
	System.out.println();
	
	Integer leftToR = 0;
	Integer rightToL = 0;
	
	for(int a = 0; a<numPad.length; a++) {
		leftToR += numPad[a][a];
		System.out.println(leftToR);
	}
	
	for(int b = 0; b<numPad.length; b++) {
		int c = numPad.length - (b+1);
		rightToL += numPad[b][c];
		
		
		System.out.println(rightToL);
		
		int absDiff = Math.abs(leftToR - rightToL);
		System.out.println(absDiff);
		
	}
	
	
	}
}
