package Easy;

import java.util.ArrayList;
import java.util.Collections;

public class GetSmallAndLargeSub {
	public static void main(String[] args) {
		
		
		System.out.println(getSmallestAndLargest("welcometojava", 3));
		System.out.println(getSmallestAndLargest("welcometojava", 4));
		
	}
	public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        ArrayList<String> subList = new ArrayList<String>();
        
        for(int a = 0; a<s.length()-(k-1); a++) {
        	String x = s.substring(a, (a+k));
        	subList.add(x);
        }
        
        System.out.println(subList);
        
        
        Collections.sort(subList);
        smallest = subList.get(0);
        largest = subList.get(subList.size()-1);
       
        
        return smallest + "\n" + largest;
    }
	
	
	
}
