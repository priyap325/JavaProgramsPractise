package practice1;

import java.util.HashMap;
import java.util.Map;

public class CharCountUsingMap {
	
	static void characterCount(String inputString) 
    { 
        // Creating a HashMap containing key and value
        
        HashMap<Character, Integer> mp = new HashMap<>(); 
  
        // Converting given string to char array 
  
        char[] charArray = inputString.toCharArray();
			
		for (char c : charArray) { 
    
			if (mp.containsKey(c)) { 
  
                mp.put(c, mp.get(c) + 1); 
            } 
            else { 
                mp.put(c, 1); 
            } 
        } 
		
        // Printing the charCountMap 
        for (Map.Entry entry : mp.entrySet()) { 
            System.out.println(entry.getKey() + " " + entry.getValue()); 
        } 
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String txt="You have no choice other than following me!";
		characterCount(txt);
	
	}
}
