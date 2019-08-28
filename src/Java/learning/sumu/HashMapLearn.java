package Java.learning.sumu;

import java.util.HashMap;

public class HashMapLearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> project = new HashMap<String, String>();
		project.put("Sumukha", "Vantage");
		project.put("Sumanth", "Vantage");
		project.put("Katte", "Vantage");
		project.put("Sadashiv", "ALcatraz");
		
		System.out.println(project);
		
		//boolean result = project.containsValue("Vantage1");
		
		// Verify if Value is present in any of associated Hashmap entry
		if ((project.containsValue("Vantagel")))
		{System.out.println("Contains value");}
		else
			{System.out.println( "Doesn't contain value");}
		
		//Get value of associated Key
		String value = project.get("Sadashiv");
		System.out.println(value);
		
		}
	

}
