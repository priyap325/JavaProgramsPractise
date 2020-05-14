package practice1;

public class CountOfCases2 {
	
	 @SuppressWarnings("deprecation")
	static void character_case_count(String inputString)
	    {
	        //Getting total no of characters in the given string
	         
	        int totalChars = inputString.length();
	         
	        //Initializing upperCaseLetters, lowerCaseLetters, digits and others with 0
	         
	        int upperCaseLetters = 0;
	         
	        int lowerCaseLetters = 0;
	         
	        int digits = 0;
	         
	        int spaces = 0;
	        
	        int others = 0;
	         
	        //Iterating through each character of inputString
	         
	        for (int i = 0; i < inputString.length(); i++) 
	        {
	            char ch = inputString.charAt(i);
	             
	            //If ch is in uppercase, then incrementing upperCaseLetters
	             
	            if(Character.isUpperCase(ch))
	            {
	                upperCaseLetters++;
	            }
	             
	            //If ch is in lowercase, then incrementing lowerCaseLetters
	             
	            else if(Character.isLowerCase(ch))
	            {
	                lowerCaseLetters++;
	            }
	             
	            //If ch is a digit, then incrementing digits
	             
	            else if (Character.isDigit(ch))
	            {
	                digits++;
	            }
	             
	            //If ch is a special character then incrementing others
	            
	            else if (Character.isSpaceChar(ch))
	            {
	            	spaces++;
	            }
	             
	            else
	            {
	                others++;
	            }
	        }
	         
	         
	        //Printing percentage of uppercase letters, lowercase letters, digits and other characters
	         
	        System.out.println("In '"+inputString+"' : ");
	         
	        System.out.println("No.of Uppercase letters are "+upperCaseLetters);
	         
	        System.out.println("No.of Lowercase letters are "+lowerCaseLetters);
	         
	        System.out.println("No.of Digits are "+digits);
	        
	        System.out.println("No.of Spaces are "+spaces);
	        
	         
	        System.out.println("Other Characters are "+others);
	         
	    }
	     

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		character_case_count("1. It is Work from Home  not Work for Home");
			 
		}
	}

