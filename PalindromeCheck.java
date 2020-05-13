package practice1;

public class PalindromeCheck {

	/*
	 * String word = "malayalam"; char[] ch = word.toCharArray();
	 */
	
	public static void main(String[] args) {
		isPalindrome("malayalam");
		isPalindrome("TestLeaf");
	}
		public static void isPalindrome(String str) {
			boolean result = true;
			int len = str.length();
			for(int i=0; i < len/2; i++) {
				if(str.charAt(i) != str.charAt(len-i-1)) {
					result = false;
					break;
				}
			}
			System.out.println(str + " is palindrome = "+result);

	}
}

