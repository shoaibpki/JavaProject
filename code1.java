package dataTypes;

public class code1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("implicit type casting");
		char a = 'A';
		System.out.println("value of a : "+a);
		int b = a;
		System.out.println("value of b : "+b);
		float c = b;
		System.out.println("value of c : "+c);
		long d = a;
		System.out.println("value of d : "+d);
		double e = a;
		System.out.println("value of e : "+e);
		System.out.println("\n");
		System.out.println("explicit type casting");
		
		//explicit conversion
		double x = 45.5;
		int y = (int) x;
		System.out.println("value of x : "+x);
		System.out.println("value of y : "+y);
	}

}
