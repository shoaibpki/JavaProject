package dataTypes;
class operations extends Thread{

	public void run () {
		if(Thread.currentThread().getName().equals("Addition"))
			add();
		else if (Thread.currentThread().getName().equals("Subtraction"))
			sub();
		else if (Thread.currentThread().getName().equals("Multiplication"))
			mul();
		else if (Thread.currentThread().getName().equals("Division"))
			div();
	}
	void add(){
		System.out.println("Addition applied");
	}
	void sub() {
		System.out.println("Subtraction applied");
	}
	void mul() {
		System.out.println("Multiplication applied");
	}
	void div() {
		System.out.println("Division applied");
	}
}

public class ThreadingCode1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Thread t = new Thread();
//		System.out.println(t);
//		t.setName("Shaktiman");
//		t.setPriority(1);
//		System.out.println(t);
//		System.out.println(Thread.currentThread().getName());
		operations op1 = new operations(); //thread-1
		operations op2 = new operations(); //thread-2
		operations op3 = new operations(); //thread-3
		operations op4 = new operations(); //thread-4
		
		op1.setName("Addition");
		op2.setName("Subtraction");
		op3.setName("Multiplication");
		op4.setName("Division");
		
	    op1.start();//op1 is given to the scheduler
        op2.start();//op2 is given to the scheduler
        op3.start();//op3 is given to the scheduler
        op4.start();//op4 is given to the scheduler		
	}

}
