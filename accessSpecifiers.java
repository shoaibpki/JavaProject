package dataTypes;
class defAccessSpecifier{
	void display() //default : available only within same package
	{
		System.out.println("you are using default asses specifier");
	}
}
class defpAccessSpecifier{
	private void display() //private : only within the class
	{
		System.out.println("you are using private asses specifier");
	}
}
class defprAccessSpecifier{
	void display() //protected : available within same package and also inheritance class
	{
		System.out.println("you are using protectd asses specifier");
		
	}
}
public class accessSpecifiers {
	public static void main(String[] args) {
		System.out.println("Defualt access specifier");
		defAccessSpecifier obj1 = new defAccessSpecifier();
		obj1.display();
		
		System.out.println("Private access specifier");
		defpAccessSpecifier obj2 = new defpAccessSpecifier();
//		obj2.dislay(); cant use private out of class (error)
		
		System.out.println("protected access specifier");
		defprAccessSpecifier obj3 = new defprAccessSpecifier();
		obj3.display();
	}
}
