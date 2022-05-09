package dataTypes;

class Operations1 implements Runnable{

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

public class threadCode2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operations1 op1 = new Operations1();//not a thread
        Operations1 op2 = new Operations1();//not a thread
        Operations1 op3 = new Operations1();//not a thread
        Operations1 op4 = new Operations1();//not a thread
        
        Thread t1 = new Thread(op1);
        Thread t2 = new Thread(op2);
        Thread t3 = new Thread(op3);
        Thread t4 = new Thread(op4);
        
        t1.setName("Addition");
        t2.setName("Subtraction");
        t3.setName("Multiplication");
        t4.setName("Division");
        
        t1.start();//t1 is given to the scheduler
        t2.start();//t2 is given to the scheduler
        t3.start();//t3 is given to the scheduler
        t4.start();//t4 is given to the scheduler
	}

}
