package OCAJP8_Practice;

import java.util.List;
import java.util.ArrayList;

public class Collect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> lst = new ArrayList<>();
		
		
		
		lst.add("a");
		lst.add("b");
		
		String str = lst.remove(0);
		
		System.out.println(str + lst.remove(0));
		
		try {
			System.out.println(lst.remove(0));
		}catch (Exception e) {
			System.out.println(e.getMessage()); 
		}
		
		

	}

}
