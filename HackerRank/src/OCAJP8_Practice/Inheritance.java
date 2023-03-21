package OCAJP8_Practice;
import Easy.IfStatement;

public class Inheritance extends IfStatement{
	
	String a;
	Inheritance(){				//Attempt to increment variable from superclass on Instantiation
		super();
		//new Inheritance().subtypeInstanceCreated();       //Stackoverflow error
		IfStatement.subtypeInstanceCreated();		//Inheritated Method not accessable thourgh new If class. Only works if subtypeInstanceCreated(); is public
		//ifS.subtypeInstanceCreated();					//Tried dependency injection of IfStatement class.
	}
	
	public static void main(String[] args){
		//System.out.println(new IfStatement().allSubtypeInstantsCreated());
		System.out.println(Inheritance.allSubtypeInstantsCreated());
		
		Inheritance inH = new Inheritance();
		
		System.out.println(Inheritance.allSubtypeInstantsCreated());
		
	//	System.out.println(new IfStatement().allSubtypeInstantsCreated());      //Refrence a static variable of IfStatement
				
	//	IfStatement.main();
		
		inH.c++;							//c variable from IfStatement accesable when access is EXPLICITLY protected
		System.out.println(inH.c);
		
		//IfStatement iFS = new Inheritance();
		
		//System.out.println(iFS.toString());
		
		IfStatement ifs = new IfStatement();
		
		//System.out.println(ifs.c);			// c variable not accessable from instantiating super class in sub class
		
	boolean isTrue = inH instanceof IfStatement;
		System.out.println(isTrue);
	}
	
	
	
}
