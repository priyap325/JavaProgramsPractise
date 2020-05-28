package practice1;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number, temp, total = 0;
	      System.out.print("Armstrong number between 1 to 1000 : ");
	      for(int a = 1; a <= 1000; a++)
	      {
	         number = a;
	         while(number > 0)
	         {
	            temp = number % 10;
	            total = total + (temp * temp * temp);
	            number = number / 10;
	         }
	         if(total == a)
	         {
	            System.out.print(a + " ");
	         }
	         total = 0;
	      }

	}

}
