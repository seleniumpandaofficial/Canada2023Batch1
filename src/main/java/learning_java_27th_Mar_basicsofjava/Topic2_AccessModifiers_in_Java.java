package learning_java_27th_Mar_basicsofjava;

public class Topic2_AccessModifiers_in_Java {

	public static void main(String[] args) {
		

	}
	
	private static void secret() {
		System.out.println("This is a private method");
	}
	
	protected static void careful() {
		System.out.println("This is a protected method");
	}
	
	static void casual() {
		System.out.println("This is a default method");
	}

}
