package practice1;

public class CharCount {
	
	// Method that returns the count of given character in the string 
    public static int count(String s, char c) 
    { 
        int count_of_char = 0; 
  
        for (int i=0; i<s.length(); i++) 
        { 
            // checking character in string 
            if (s.charAt(i) == c) 
            count_of_char++; 
        }  
        return count_of_char; 
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "You have no choice other than following me!"; 
        char c = 'o'; 
        System.out.println(count(str, c));
	}

}
