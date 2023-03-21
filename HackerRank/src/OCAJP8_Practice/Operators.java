package OCAJP8_Practice;

public class Operators {
	
	static int x = 5;
	static int y = x++;
	static int z = ++x;
			

	public static void main(String[] args) {
	
		System.out.println(y);
		System.out.println(++y);
		System.out.println(y++);
		System.out.println(++y);
		System.out.println(z);
		
		boolean a = false;
		boolean b = true;
		
		boolean c = (a||!b) && b;
		boolean d = (!a||!b) && b;
		boolean e = (a||!b) && a;
		boolean f = (!a||!b) && a;
		
		System.out.println(c);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
		//int exp = x<<2;
		//int exp1 = x<<3;
		
		//System.out.println(exp);
		//System.out.println(exp1);
		int shiftRightOper = -256;
		int toShiftBy = 2;
		//boolean shift = (x<<toShiftLeftBy) == (shiftLeftMath(x,toShiftLeftBy));
		
		//int rightOpShifted = shiftRightOper>>toShiftBy;
		//int rightOpMethod = shiftRightMath(shiftRightOper,toShiftBy);
		//int shift = Integer.compare(rightOpShifted, rightOpMethod); 
		
		boolean shift = (shiftRightOper>>toShiftBy) == (shiftRightMath(shiftRightOper,toShiftBy));
		
		System.out.println(shiftRightOper>>toShiftBy);
		
		//System.out.println(shiftRightOper>>>toShiftBy);    //Operator should be negative number to get results different from shift right (>>)
		System.out.println(shift);
		
		System.out.println(~shiftRightOper);
		System.out.println(~toShiftBy);
		
		System.out.println(true^false|true);
		
		

	}

	public static int shiftLeftMath(int oper, int shiftBy) {
		int shifted =  (oper * ((int)Math.pow(2, shiftBy)));
		System.out.println("Method answer: " + shifted);
		return shifted;
		
	}
	
	public static int shiftRightMath(int oper, int shiftBy) {
		int shifted =  (oper / ((int)Math.pow(2, shiftBy)));
		System.out.println("Method answer: " + shifted);
		return shifted;
		
	}
}
