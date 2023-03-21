package OCAJP8_Practice;

import java.util.Objects;

public class IfStatement {
	
	static int a = 3;
	static int b = 4;
	protected int c;
	public static void main(String[] args) {
		
		if(a>b){
			System.out.println(a);
			System.out.println(b);
		}
		else{
				System.out.println(a);
			}
			
		boolean bool = a>b ? true:false;
		boolean bool1 = a<b ? true:false;
		System.out.println(bool);
		System.out.println(bool1);

	}
	
	protected void subtypeInstanceCreated() {
		b++;
	}
	
	protected int allSubtypeInstantsCreated() {
		return b;
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(c);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IfStatement other = (IfStatement) obj;
		return c == other.c;
	}

	@Override
	public String toString() {
		return "IfStatement [c=" + c + ", allSubtypeInstantsCreated()=" + allSubtypeInstantsCreated() + ", hashCode()="
				+ hashCode() + ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}

	
}
