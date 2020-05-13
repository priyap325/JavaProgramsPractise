package practice1;

public class PalindromeCheck2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "malayalam";
String rev ="";
for (int i = str.length()-1; i>=0; i--) {
	rev = rev+str.charAt(i);
	
}
System.out.println(str.equals(rev)?"Yes, Palindrome":"No, not a Palindrome");
	}

}
