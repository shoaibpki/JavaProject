package dataTypes;
import java.util.*;
import java.util.regex.*;

public class emailExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> emails = new ArrayList<>();
		emails.add("javaTpoint@domain.co.in");
		emails.add("javaTpoint@domain.com");
		emails.add("javaTpoint.name@domain.co.in");
		emails.add("javaTpoint#@domain.co.in");
		emails.add("javaTpoint@domain.com");
		emails.add("javaTpoint@domaincom");
		
		//adding invalid emails in list
		emails.add("@yahoo.com");
		emails.add("javaTpoing#domain.com");
		
		//regular expression
		String regex = "^(.+)@(.+)$";
		
		//compile regular expression to get the pattern
		Pattern pattern = Pattern.compile(regex);
		
		//iterate emails array list
		for (String email: emails) {
			Matcher matcher = pattern.matcher(email);
			System.out.println(email+ ":" + matcher.matches()+"\n");
		}
		
	}

}
