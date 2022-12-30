package Easy;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Anagram {
	
	//Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies. 
	//For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "anagram";
		String b = "margana";
		
		if(isAnagram(a,b)) {
			System.out.println("Anagrams");
		} else {
			System.out.println("Not Anagrams");
		}
		
	}

	public static boolean isAnagram(String a, String b) {
		Map<Character, Integer> anagramGraph = new TreeMap<>();
		Map<Character, Integer> anagramGraph2 = new TreeMap<>();
		
		char[] A = a.toLowerCase().toCharArray();
		char[] B = b.toLowerCase().toCharArray();
		
		for(char z: A) {
			if(!anagramGraph.containsKey(z)) {
				anagramGraph.put(z, 1);
			} if(anagramGraph.containsKey(z)) {
				anagramGraph.replace(z, anagramGraph.get(z)+1);
			}
		}
		
		for(char y: B) {
			if(!anagramGraph2.containsKey(y)) {
				anagramGraph2.put(y, 1);
			} if(anagramGraph2.containsKey(y)) {
				anagramGraph2.replace(y, anagramGraph2.get(y)+1);
			}
		}
		
		if(anagramGraph.keySet().containsAll(anagramGraph2.keySet())) {
			if(anagramGraph.values().containsAll(anagramGraph2.values())) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
		
	
		
	}
}
