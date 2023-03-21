package Easy;

public class IfStatement {
	static int a = 3;
	static int b = 4;
	 protected int c;
	
	public static void main() {
		System.out.println(allSubtypeInstantsCreated());
	}
	public static void subtypeInstanceCreated() {
		b++;
	}
	
	public static int allSubtypeInstantsCreated() {
		return b;
		
	}
}
