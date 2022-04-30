package dataTypes;

import java.util.Scanner;

class operation {
	void add(double num1, double num2) {
		double addition = num1+num2;
		System.out.println("the addition result is: " + addition);
	}
	void sub(double num1, double num2) {
		double Subtraction = num1-num2;
		System.out.println("the Subtraction result is: " + Subtraction);
	}
	void mul(double num1, double num2) {
		double m = num1*num2;
		System.out.println("the multiplication result is: " + m);
	}
	void div(double num1, double num2) {
		double d = num1/num2;
		System.out.println("the division result is: " + d);
	}
	void perc (double num1, double num2) {
		float per = (float)((num1+num2)*100)/20;
		System.out.println("The percentage result is: " + Math.round(per)+"%");
	}
	void mod(double num1, double num2) {
		double m = num1%num2;
		System.out.println("the modulus result is: " + m);
	}
}
public class calculator {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sc = new Scanner(System.in);

		System.out.println("enter the num 1");
		double num1 = sc.nextDouble();
		
		System.out.println("enter the num 2");
		double num2 = sc.nextDouble();

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
