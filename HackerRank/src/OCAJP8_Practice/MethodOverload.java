package OCAJP8_Practice;

public class MethodOverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(sum(1,2,3,4));

	}
	
	public static int sum(int a, int b) {
		return a + b;
	}
	
	public static int sum(int... args) {
		int a = 0;
		for (int y : args) {
			a += y;
		}
		return a;
		
	}
	
	public static int sum(short a, short b) {
		int c = 0;
		c = a + b;
		return c;
	}
	
	public static int sum(long a, long b) {
		int c = 0;
		c = (int) (a + b);
		return c;
	}

}
