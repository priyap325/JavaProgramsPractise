package practice1;

public class Reverse_Alt_Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String sentence = "When the world realise its own mistake, corona will dissolve automatically";
		    System.out.println(reverse_Alt(sentence));

	}

	public static String reverse_Alt(String sentence) {
	    String result = "";
	    String[] words = sentence.split(" ");
	    // we'll reverse only every second word according to even/odd index
	    for (int i = 0; i < words.length; i++) {
	        if (i % 2 == 1) {
	            result += " " + reverse(words[i]);
	        } else {
	            result += " " + words[i];
	        }
	    }
	    return result;
	}
	
	public static String reverse(String word) {
	    return new StringBuilder(word).reverse().toString();
}
}