package Java.learning.sumu;

import java.util.HashMap;

public class OccuranceOfCharacter {

	public static void main(String[] args) {
		OccuranceOfCharacter occ = new OccuranceOfCharacter();
		occ.checkOccurance("Sumukha Sharma");

	}
	
	public void checkOccurance(String value){
		
		HashMap<Character, Integer> hash = new HashMap<Character, Integer>();
		
		char[] charvalue = value.toCharArray();
		
		for (char s : charvalue ){
			
		 if (hash.containsKey(s))		 
		 {hash.put(s, hash.get(s)+1);}
		 else
		 {hash.put(s,1);}
		 
		}
		
		System.out.println(hash);
		
	}

}
