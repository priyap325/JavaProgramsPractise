package practice1;

public class Duplicates_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2};
		 System.out.println("Duplicate items in given array: "); 
		 for(int i=0; i<my_array.length; i++){
			 for(int j = i+1; j<my_array.length;j++){
				 if(my_array[i]==my_array[j]){
					 System.out.println(my_array[j]);
				 }
			 }
		 }
	}

}
