package java_OOPS_23rd_Apr_2023;

//A concrete class can extend an Abstract Class

public class Logical extends Concept {

	public static void main(String[] args) {
		Logical child = new Logical();
		child.logic();
		child.secret();
		
		//can I create the object of Abstract class. 
		
		// Concept parent = new Concept();
	}

	@Override
	public void logic() {
		System.out.println("this is over-ridden logic method");

	}

	@Override
	public void secret() {
		System.out.println("this is over-ridden secret method");

	}

}
