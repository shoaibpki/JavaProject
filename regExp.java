package dataTypes;
import java.util.regex.*;

public class regExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern = "[a-z]+";
		String check = "Regular Expression";
		Pattern p = Pattern.compile(pattern);
		Matcher c = p.matcher(check);
		
		while (c.find())
			System.out.println(check.substring(c.start(),c.end()));
	}

}
