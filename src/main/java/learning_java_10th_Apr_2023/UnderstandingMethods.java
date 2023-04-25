package learning_java_10th_Apr_2023;

public class UnderstandingMethods {
	//methods are like factories in java
	//they are work places. You pass certain input, create a logic and they will give you the output
	
	//syntax
	//accessmodifier static/non-static return-type nameofthemethod(){
	
	//Return type means what is the output of the logic of that particular method
	
	// }
	
	//Call the method inside the main method
	//if the method is static. Then it can call itself directly or with the help of the ClassName
	//What if the method is not static ?? - Then you have to create the Object of the Class and call the method via the Object Reference
	public static void main(String[] args) {
		System.out.println("The sum in main method is : " + (2 + 3));
		test();
		UnderstandingMethods.test();
		
		test1();
		UnderstandingMethods.test1();
		
		test2(22, 6);
		UnderstandingMethods.test2(23, 6);
		
		test3("Hari");
		UnderstandingMethods.test3("Gopi");
		
		int sumOfTwoNumbers = sum(2, 3);
		System.out.println(sumOfTwoNumbers);
		
		declare("Hello", "world");
		
		logic();
	}
	
	
	public static void test() {
		System.out.println("The sum in test method is :" + (2 + 3));
	}
	
	private static void test1() {
		System.out.println("This is priavate method which is static");
	}
	
	protected static void test2(int rollnumber, int age) {
		System.out.println("This is protected method which is static");
	}
	
	static void test3(String name) {
		System.out.println("This is default method which is static");
	}
	
	public void test4() {
		System.out.println("This is non-static public method");
	}
	
	public static int sum(int i, int j) {
		int sum = i + j;
		//System.out.println(sum);
		return sum;
		
	}
	
	public static String declare(String S1, String S2) {
		String S3 = S1 + S2;
		
		System.out.println(S3);
		return S3;
	}
	
	
	public static boolean logic() {
		boolean b1 = true;
		boolean b2 = false;
				if(b1 == b2) {
					System.out.println("Logic is correct");
				}else {
					System.out.println("Logic is incorrect");
				}
				return b1;
	}

}
