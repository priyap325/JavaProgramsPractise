package practice1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsernameCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Priya*123";
		String pattern = "[a-zA-Z0-9._$@]{8,}";
		Pattern compile = Pattern.compile(pattern);
		Matcher matcher = compile.matcher(str);
		System.out.println(matcher.matches());
	}

}
