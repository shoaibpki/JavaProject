
public class callMethod {
	int val = 150; //instance variable
	
	void operation(int val /*local variable*/) {
		this.val = val * 10 /100; //value in instance variable
		//val = val * 10 / 100; // value in local variable
	}
	public static void main(String[] args) {
		callMethod d = new callMethod();
		System.out.println("Before operation value of data is: "+ d.val);
		d.operation(100);
		System.out.println("After operation value of data is: "+ d.val);
	}
	

}
