package OCAJP8_Practice;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Except {
	
	static int a = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			//System.out.println(a/0);
			throwNullPointer();
		}catch(ArithmeticException | NullPointerException e ){
			System.out.println("A");
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println(e.getClass().getSimpleName());
		}
		

//		try {
//			System.out.println(a/0);
//		}catch(Exception e) {                          //2nd catch wont run because Exception catches all. compile tiem error on line 23
//			System.out.println(e.getClass().getSimpleName());
//		}catch(ArithmeticException | NullPointerException | RuntimeException e){        //Runtimeexception covers other exceptions, compile time error
//			System.out.println(e.getMessage());
//		}
		
	}

	public static int throwNullPointer() throws ArithmeticException{
		int a = 1;
		int b = 0;
		return a/b;
	}
	
	public static IOException throwAnException() {
		try {
			 return new IOException();
		} catch(FileNotFoundException e) {
			e.getMessage();
			return new FileNotFoundException();
		}
	}
		
}
	
