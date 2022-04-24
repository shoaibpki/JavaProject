package dataTypes;

import java.util.Scanner;

class operation {
	void add(int num1, int num2) {
		int addition = num1+num2;
		System.out.println("the addition result is: " + addition);
	}
	void sub(int num1, int num2) {
		int Subtraction = num1-num2;
		System.out.println("the Subtraction result is: " + Subtraction);
	}
	void mul(int num1, int num2) {
		int m = num1*num2;
		System.out.println("the multiplication result is: " + m);
	}
	void div(int num1, int num2) {
		int d = num1/num2;
		System.out.println("the division result is: " + d);
	}
	void perc (int num1, int num2) {
		int per = (num1+num2);
		System.out.println("The percentage result is: " + per);
	}
	void mod(int num1, int num2) {
		int m = num1%num2;
		System.out.println("the modulus result is: " + m);
	}
}
public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		operation op = new operation();
		
		if(n==1) {
			op.add(num1, num2);
		}
		if(n==2) {
			op.sub(num1, num2);
		}
		if(n==3) {
			op.mul(num1, num2);
		}
		if(n==4) {
			op.div(num1, num2);
		}
		if(n==5) {
			op.mod(num1, num2);
		}
		if(n==6) {
			op.perc(num1, num2);
		}
		else {
			System.exit(0);
		}
	}

}
