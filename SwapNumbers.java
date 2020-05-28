package practice1;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5; 
        int b = 10; 
  
        // Code to swap 'x' and 'y' 
        a = a * b; // a now becomes 50 
        b = a / b; // b becomes 10 
        a = a / b; // a becomes 5 
  
        System.out.println("After swaping:"
                           + " a = " + a + ", b = " + b); 
	}

}
