package dataTypes;
import java.util.regex.*;
public class regexExampl4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("? quantifier ....");
		System.out.println(Pattern.matches("[amn]?", "a"));
		System.out.println(Pattern.matches("[amn]?", "aaa"));
		System.out.println(Pattern.matches("[amn]?", "aammmnn"));
		System.out.println(Pattern.matches("[amn]?", "aazzzt"));
		System.out.println(Pattern.matches("[amn]?", "m"));
		
		System.out.println("+ quantifier ....");  
		System.out.println(Pattern.matches("[amn]+", "a"));//true (a or m or n once or more times)  
		System.out.println(Pattern.matches("[amn]+", "aaam"));//true (a comes more than one time)  
		System.out.println(Pattern.matches("[amn]+", "aammmnn"));//true (a or m or n comes more than once)  
		System.out.println(Pattern.matches("[amn]+", "aazzta"));//false (z and t are not matching pattern)

		System.out.println("* quantifier ....");  
		System.out.println(Pattern.matches("[amn]*", "ammmna"));//true (a or m or n once or more times)  
	}

}
