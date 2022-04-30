
public class overloadMethod {
	public void area (int b, int h) {
		System.out.println("Area of triangle: "+ (.5*b*h));
	}
	public void area (int r) {
		System.out.println("Area of circle: " +(3.14*r*r));
	}
	public static void main(String[] args) {
		overloadMethod b = new overloadMethod();
		b.area(4);
		b.area(3, 4);
	}

}
