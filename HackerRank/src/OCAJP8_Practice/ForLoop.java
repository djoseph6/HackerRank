package OCAJP8_Practice;

public class ForLoop {

	public static void main(String[] args) {
		
		int a = 0;
			for(a=1;a<10;a++) {                 //for loop first run does not increment a. second run uses incrementation of both for loop and statement.
				System.out.println("Before statement increment: " +a);
				a++;                            //if operator is one less/one greater or = termination int, for loops increment/decrement will execute but statement will not.
			 System.out.println("After statement increment: " +a);
			}
			
			System.out.println(a);
			
			int b = 0;
			for(b=1; b<9;b++) {                 //
				System.out.println("Before statement increment: " +b);
				b++;
				System.out.println("After statement increment: " +b);
			}
			System.out.println(b);
			
			int c = 0;
			for(c=10; c>0;c--) {                 //
				System.out.println("Before statement increment: " +c);
				c--;
				System.out.println("After statement increment: " +c);
			}
			System.out.println(c);

	}

}
