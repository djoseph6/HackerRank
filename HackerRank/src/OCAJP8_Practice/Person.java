package OCAJP8_Practice;

public class Person {
	Person(){
		System.out.println("A B");
	}

	{System.out.println("E F");}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person pr = new Manager();

	}

}

class Manager extends Person{
	Manager(){
		System.out.println("C D");
	}
	
	{System.out.println("G H");}
}

class Begin{
	
}
