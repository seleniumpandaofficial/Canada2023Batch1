package java_OOPS_23rd_Apr_2023;

public class Method_Overloading {

	public static void main(String[] args) {
		display();
		display(10);
		display(20, 30);
		display("World");
		display("hello", "world");
		display("Hello", 10);
		display(new StringBuffer("Join"));
		display(new StringBuilder("Join"));
		display(new StringBuilder("Join"), "Dom");
		display(new StringBuilder("Join"), new StringBuffer("Join"));
		display(new StringBuilder("Join"), new StringBuffer("Join"), "Hello");
	}
	
	
	public static void display() {
		System.out.println("this is a non parameterized display method");
	}
	
	public static void display(int i) {
		System.out.println("this is an int parameter display method");
	}
	
	public static void display(int i, int j) {
		System.out.println("this is multiple int parameters display method");
	}
	
	public static void display(String S) {
		System.out.println("this is a String parameter display method");
	}
	
	public static void display(String S1, String S2) {
		System.out.println("this is multiple String parameters display method");
	}
	
	public static void display(String S1, int i) {
		System.out.println("this is multiple String and int parameters display method");
	}
	
	public static void display(StringBuffer S) {
		System.out.println("this is a StringBuffer parameter display method");
	}
	
	public static void display(StringBuilder S) {
		System.out.println("this is a StringBuilder parameter display method");
	}
	
	public static void display(StringBuilder S1, String S2) {
		System.out.println("this is a StringBuilder and String parameter display method");
	}
	
	public static void display(StringBuilder S1, StringBuffer S2) {
		System.out.println("this is a StringBuilder and StringBuffer parameter display method");
	}
	
	public static void display(StringBuilder S1, StringBuffer S2, String S3) {
		System.out.println("this is a StringBuilder, String and StringBuffer parameter display method");
	}

}
