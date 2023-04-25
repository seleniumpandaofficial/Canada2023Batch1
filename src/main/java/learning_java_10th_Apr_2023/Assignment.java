package learning_java_10th_Apr_2023;

public class Assignment {
	/*
	 * make 5 instance variables make 2 static variables
	 * 
	 * create the main method which will be static
	 * 
	 * 
	 * create 3 static methods
	 * 
	 * create 3 non-static methods
	 * 
	 * 
	 * in the main method call the static methods directly also call them via className
	 * 
	 * then create the object of the class and with the object reference call the
	 * non-static methods
	 * 
	 * in the nonstatic methods call the static methods
	 */

	String name;
	int age;
	double height;
	boolean passorfail;
	String subject;

	static int number_bats;
	static String surname;

	public static void main(String[] args) {
		display1();
		display2();
		display3();
		surname = "Mishra";
		Assignment.surname = "Kapoor";
		
		Assignment assignment = new Assignment();
		assignment.sample1();
		assignment.sample2();
		assignment.sample3();
		assignment.name = "Sarthak";
		assignment.subject = "Java";
		assignment.surname = "Panda";
		
		assignment.display1();
		
		//non static entities can call static
		//when  you create an object, the reference can call a static entity but the compiler will give you a warning
		//why are you trying this ?? a static is already privileged to be called directly or by the className
		//why do you need an object reference to call it ?
		
		
		Assignment assignment1 = new Assignment();
		assignment1.sample1();
		assignment1.sample2();
		assignment1.sample3();
		
		Assignment assignment2 = new Assignment();
		assignment2.sample1();
		assignment2.sample2();
		assignment2.sample3();
		
		Assignment assignment3 = new Assignment();
		assignment3.sample1();
		assignment3.sample2();
		assignment3.sample3();
	}

	public static void display1() {
		System.out.println("This is static display1 method");
	}

	public static void display2() {
		System.out.println("This is static display2 method");
	}

	public static void display3() {
		System.out.println("This is static display3 method");
	}

	public void sample1() {
		System.out.println("This is non-static sample1 method");
		display1();
		display2();
		display3();
	}

	public void sample2() {
		System.out.println("This is non-static sample2 method");
		display1();
		display2();
		display3();
	}

	public void sample3() {
		System.out.println("This is non-static sample3 method");
		display1();
		display2();
		display3();
	}

}
