
public class methodExecution {
	public  int multipynumbers(int a, int b) {
		int z = a * b;
		return z;
	}

	public static void main(String[] args) {
		methodExecution b =  new methodExecution();
		int c = b.multipynumbers(4, 5);
		System.out.println("Multipilcation is: "+ c);
	}

}
