package OCAJP8_Practice;

public class StrgMunipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string = new String("Apple Bottom Jeans with the Boots and the Fur");
		
		string = string.replaceAll("\\s", "-");
		
		String string1 = string.concat(string);
		
		System.out.println(string + string1);
		
		System.out.println(string);
		
		String[] stringArr = string.split("-");
		
		for(String a: stringArr) System.out.println(a);
		
		string = String.join(".", stringArr);
		
		System.out.println(string);
		
		StringBuffer newSB = new StringBuffer(string);
		newSB.reverse();
		System.out.println(newSB);
	}

}
