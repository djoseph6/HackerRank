package OCAJP8_Practice;

public class BreakAndContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		biteme: for(i=1; i<4; i++) {
			j=1;
			System.out.println(j);
				while(j<4) {
					
					if(j%2 == 0) {
						break biteme;
					}
					
				j++;
				System.out.println(j);
				System.out.println("Inner");
				}
			System.out.println("Outer");
			//System.out.println(i);
		}
		
		//System.out.println(i);
		
		int a, b;
		biteme: for(i=1; i<4; i++) {
			a=1;
			System.out.println(a);
				while(a<4) {
					
					if(a%2 == 0) {
						continue biteme;
					}
					
				a++;
				System.out.println(a);
				System.out.println("Inner");
				}
			System.out.println("Outer");
			//System.out.println(i);
		}
		
		for(int c = 0; c<3; c++) {
			for(int d = 0; d<5; d++) {
				System.out.println("Abra");
				continue;
				
			}
		}
	}

}
