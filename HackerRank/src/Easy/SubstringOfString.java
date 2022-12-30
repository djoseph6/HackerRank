package Easy;

import java.util.Scanner;

public class SubstringOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Given a string, , and two indices,  and , print a substring consisting of all characters in the inclusive range from  to . 
		//You'll find the String class' substring method helpful in completing this challenge.
		
		 Scanner in = new Scanner(System.in);
	        String S = in.next();
	        int start = in.nextInt();
	        int end = in.nextInt();
	        
	        
	        
	        String newString = S.substring(start, end);
	        System.out.println(newString);
	        
	        
	}

}
