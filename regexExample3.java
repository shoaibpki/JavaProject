package dataTypes;

import java.util.regex.*;
public class regexExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Pattern.matches("[amn]", "abcd"));
		System.out.println(Pattern.matches("[amn]", "a"));
		System.out.println(Pattern.matches("[amn]", "ammmna"));
	}

}
