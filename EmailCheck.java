package practice1;

import java.util.regex.Pattern;

public class EmailCheck {

	public static boolean isValid(String email) 
	{ 
		String emailRegex = "[a-zA-Z0-9._]+@[a-z0-9]+.[a-z.]{2,}";
							
		Pattern pat = Pattern.compile(emailRegex); 
		if (email == null) 
			return false; 
		return pat.matcher(email).matches(); 
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email = "priya?.pac_kirisamy@gmail.com"; 
		if (isValid(email)) 
			System.out.print("Yes, E-mail is valid"); 
		else
			System.out.print("No, E-mail is not valid"); 
	}

}
