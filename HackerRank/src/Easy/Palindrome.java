package Easy;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String start = "madam";
		System.out.println(palindromeTester(start));
		
		
		
			
		
	}
	
	
	public static String palindromeTester(String pal) {
		char[] charOfPal = pal.toCharArray();
		String revPal = "";
		String yes = "Yes";
		String no = "No";
		
		for(int a = charOfPal.length-1; a>=0; a--) {
			revPal += charOfPal[a];
		}
		System.out.println(revPal);
		
		if(pal.equals(revPal)) {
			return yes;
		} else {
			return no;
		}
		
		
	}

}
