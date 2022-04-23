package dataTypes;

import java.util.Scanner;

class operation {
	void operations() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num 1");
		int num1 = sc.nextInt();
		System.out.println("enter the num 2");
		int num2 = sc.nextInt();
		
		System.out.println("enter operator \n"
				+ "1. Addition\n"
				+ "2. Subtraction\n"
				+ "3. multiplication\n"
				+ "4. division\n"
				+ "5. modulus\n"
				+ "6. percentage\n"
				+ "7. exit");
		int n = sc.nextInt();
		
		if(n==1) {
			int addition = num1+num2;
			System.out.println("the addition result is: " + addition);
		}
		if(n==2) {
			int Subtraction = num1-num2;
			System.out.println("the Subtraction result is: " + Subtraction);
		}
		if(n==3) {
			int multiplication = num1*num2;
			System.out.println("the multiplication result is: " + multiplication);
		}
		if(n==4) {
			int division = num1/num2;
			System.out.println("the division result is: " + division);
		}
		if(n==5) {
			int mod = num1%num2;
			System.out.println("the modulus result is: " + mod);
		}
		if(n==6) {
			int per = ((num1 + num2)/20)*100;
			System.out.println("The percentage result is: " + per);
		}
		else {
			System.exit(0);
		}
	}
	
}
public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		operation op = new operation();
		for( ; ; ) {
			op.operations();
		}
	}

}
