package practice1;

public class StringAddAllDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "asdf1qwer9as8d7";
        int result = addAllDigitsInString(str);
        System.out.println("Sum of all digits in string " + str + " is " + result);

	}
	 private static int addAllDigitsInString(String str) {

	        int length = str.length();

	        // initializing the output to 0. If no digit is found in the string then default value 0 is returned.
	        int digitsSum = 0;

	        for (int i = 0; i < length; i++) {

	            char character = str.charAt(i);
	            boolean isDigit = Character.isDigit(character);

	            // adding the digit to the current digitSum value.
	            if (isDigit) {
	                digitsSum = digitsSum + Character.getNumericValue(character);
	            }

	        }
	        return digitsSum;
	    }

}
