package OCAJP8_Practice;

import java.util.ArrayList;

public class StaticKeyword {
	
	int a;
	static int b;
	static int numOfInst;
	
		StaticKeyword() {
			this.numOfInst++;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		StaticKeyword instance1 = new StaticKeyword();
		StaticKeyword instance2 = new StaticKeyword();
		System.out.println("2 instances were created");
		System.out.println("----------");
		
		System.out.println("Number of instances: " +numOfInst);
		System.out.println("Instance1 a: "+instance1.a);
		System.out.println("Instance2 a: "+instance2.a);
		System.out.println("Static variable b: " +b);
		System.out.println("----------");
		
		instance1.incrementAll();
		System.out.println("Instance 1 incremented all");
		System.out.println("----------");
		
		System.out.println("Number of instances: " +numOfInst);
		System.out.println("Instance1 a: "+instance1.a);
		System.out.println("Instance2 a: "+instance2.a);
		System.out.println("Static variable b: " +b);
		System.out.println("----------");
		
		instance2.incrementAll();
		System.out.println("Instance 2 incremented all");
		System.out.println("----------");
		
		System.out.println("Number of instances: " +numOfInst);
		System.out.println("Instance1 a: "+instance1.a);
		System.out.println("Instance2 a: "+instance2.a);
		System.out.println("Static variable b: " +b);
		System.out.println("----------");
		
		StaticKeyword.incrementStatic();								//Call classes static method without instantiating 
		System.out.println("Class incrementstatic() method invoked");
		System.out.println("----------");
		
		System.out.println("Number of instances: " +numOfInst);
		System.out.println("Instance1 a: "+instance1.a);
		System.out.println("Instance2 a: "+instance2.a);
		System.out.println("Static variable b: " +b);
		System.out.println("----------");
		
		//StaticKeyword hey =  new StaticKeyword().incrementStatic();    //wants incrementStatic to return value of class Statickeyword
		new StaticKeyword().incrementStatic();							//Create instance of class and use static method
		
		System.out.println("A new instance of the class invoked incrementstatic() method");
		System.out.println("----------");
		
		System.out.println("Number of instances: " +numOfInst);
		System.out.println("Instance1 a: "+instance1.a);
		System.out.println("Instance2 a: "+instance2.a);
		System.out.println("Static variable b: " +b);
		System.out.println("----------");
		
		//ArrayList<Integer> trying = new int[3] {1,2,3};     // Cannot assign array to Arraylist
		
	}
	
	public void incrementAll() {
		a++;
		b++;
	}
	
	public static void incrementStatic() {
		//a++;               //Compilation error
		b++;
		
	}

}
