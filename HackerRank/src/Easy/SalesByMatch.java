package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class SalesByMatch {
	
	public static void main(String[] args) {
		int king = 0;
		List<Integer> queen = Arrays.asList(1,2,3,4,5,2,3);
		
		System.out.println(sockMerchant(king,queen));
	}

	 /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
        
    	List<Integer> newlist = new ArrayList<Integer>(ar.size());
    	
    	Collections.copy(newlist, ar);
    	
    	int pairs = 0;
        int colorSocks = 0;
       Collections.sort(newlist);
    
       
        for(int a=0;a<newlist.size()-1;a++) {
        	System.out.println(a);
        	int b = newlist.get(a);
        		System.out.println(newlist.get(a+1));
        		
        		if(b==newlist.get(a+1)) {
        				System.out.println("This is running");
        			newlist.remove(a);
        			
        				
        				pairs++;
        		}
        }
        
		return pairs;
    }
    }
