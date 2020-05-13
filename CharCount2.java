package practice1;

public class CharCount2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "You have no choice other than following me!";
		
		int count = 0;
		
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if(charArray[i]=='o') {
				count = count+1;
			}
			
		}
		System.out.println("character count of o is "+count);
	}

}
