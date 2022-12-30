package Easy;

import java.util.Scanner;

public class TwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Sum the lengths of A and B.
		//Determine if A is lexicographically larger than B (i.e.: does  come before  in the dictionary?).
		//Capitalize the first letter in A and B and print them on a single line, separated by a space.
		
		
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        
       System.out.println(A.length() + B.length()); 
       
       int lex = A.compareTo(B);
       if(lex > 0) {
    	   System.out.println("Yes");
       } 
       if(lex < 0) {
    	   System.out.println("No");
       } if(lex ==0) {
    	   System.out.println("No");
       }
        
       String newA = A.substring(0, 1).toUpperCase() + A.substring(1);
       String newB = B.substring(0, 1).toUpperCase() + B.substring(1);     
      
       System.out.println(newA+" "+newB);
       
       
       //Capitalize all words in a String
      // String C = sc.nextLine();   //Method does not work with scanner
      String D = "He dosent like you";
      String[] lowAll = D.split(" ");
      for(String a: lowAll) {
    	  System.out.println(a);
      }
      
      String capAll = "";
		for(String a: lowAll) {
			String b = a.substring(0,1).toUpperCase() + a.substring(1);
			capAll += b + " ";
		}
		
		System.out.println(capAll);
	}

}
