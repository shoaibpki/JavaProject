package dataTypes;

class cars{
	//properties of cars
	String name;
	String model;
	int mod_no;
	
	//behaviour of car
	void fast() {
		System.out.println("fast car");
	}
	void start() {
		System.out.println("self start");
	}
}
public class example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cars c = new cars();
		c.name = "Cultus";
		c.model = "Suzuki";
		c.mod_no = 2022;
		
		System.out.println("car name is : "+c.name);
		System.out.println("car model is : "+c.model);
		System.out.println("car model year is : "+c.mod_no);
		c.fast();
		c.start();
	}

}
