package java_OOPS_16th_Apr_2023;

public class Static_NonStatic {
	
	//static is related to class. So we can call directly or by the nameoftheclass - that particular static entity can be called
	//in case you are non-static, then you have be called via object
	
	//static will only call static. Static cannot call non-static
	//Non-static can call static as well as non-static
	
	//so to call non-static entities inside the static main method we have to create the object
	//and with the help of object reference we can call the non-static entity
	
	//what are the three different types of variables ??
	//instance variables
	//static variables
	//local variables
	String name; //instance variable
	int age;     //instance variable
	double height;   //instance variable
	boolean passorfail; //instance variable
	static int wheels;  //static variable
	
	
	

	public static void main(String[] args) {
	display();
	Static_NonStatic obj = new Static_NonStatic();
     obj.sample("Selenium");
	}
	
	
	public static void display() {
		int i = 10;
		int j = 20;
		
		//i and j are local variables. Their proximity is within this display() method only
		//local variables are neither static nor non-static
		Static_NonStatic.wheels = 4;
		
	}
	
	
	public void sample(String S1) {
		display();
		name = "Hello";
		System.out.println("I am learning Selenium");
	}

}
