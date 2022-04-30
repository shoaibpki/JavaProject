package dataTypes;

class dog {
	//properties of the dog
	String name;
	String color;
	int cost;
	String breed;
	int age;
	
	//Behaviour of dogs
	void eat() {
		System.out.println("Dogs eats");
	}
	void run() {
		System.out.println("dog runs");
	}
	void bark() {
		System.out.println("Dog Bark");
	}
}

public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog d = new dog();
		System.out.println("the address of the object d is : "+ d);
		d.name = "Tommy";
		d.color = "gold";
		d.cost =  3000;
		d.age = 2;
		d.breed = "GR";
		System.out.println("Name of the dog is : "+d.name);
		System.out.println("color of the dog is : "+d.color);
		System.out.println("cost of the dog is : "+d.cost);
		System.out.println("age of the dog is : "+d.age);
		System.out.println("breed of the dog is : "+d.breed);
		d.eat();
		d.run();
		d.bark();
	}

}
