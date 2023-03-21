package OCAJP8_Practice;

public class StrgBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String anyStrg = new String("Candy");
		
		StringBuffer sBuffer1 = new StringBuffer(anyStrg);
		
		System.out.println(sBuffer1.capacity());
		
		sBuffer1.insert(0, 'a');
		System.out.println(sBuffer1);
		
		sBuffer1.replace(1, 3, " bottle");
		System.out.println(sBuffer1);
		
		sBuffer1.reverse();
		System.out.println(sBuffer1);
		
		sBuffer1.delete(4, 6);
		System.out.println(sBuffer1);
		
		sBuffer1.reverse();
		System.out.println(sBuffer1);
		
		Object obj = new Object();
		
		//Integer.max(obj, 0);       //compile time error

	}

}
