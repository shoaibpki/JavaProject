package dataTypes;

import java.util.Scanner;

class inException extends Exception{
	private String msg;
	public String toString() {
		return msg;
	}
	void setMsg(String s) {
		msg = s;
	}
}
class checkAge {
	// declare exception class object
	inException exc = new inException();
	
	void verifyAge() throws inException {
		//declare age
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age: ");
		int age = sc.nextInt();
		
		// compare age
		if (age < 18) {
			exc.setMsg("UnderAgeException");
		}
		else if (age > 65) {
			exc.setMsg("OverAgeExcepton"); 
		}
		else {
			exc.setMsg("Give the license");
		}
		throw exc;
	}
}
public class exceptionHandle3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkAge age = new checkAge();
		try{
			age.verifyAge();
		}
		catch (inException e) {
			System.out.println(e.toString());
		}
	}
}
