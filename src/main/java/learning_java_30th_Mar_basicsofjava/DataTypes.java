package learning_java_30th_Mar_basicsofjava;

public class DataTypes  {

	public static void main(String[] args) {
		
		//int stores integer values
		//Stores whole numbers from -2,147,483,648 to 2,147,483,647
		
		int i = -2147483648;
		int j =  2147483647;
		
		//short also stores integer values
		//Stores whole numbers from -32,768 to 32,767
		
		short s1 = -32768;
		short s2 = 32767;
		
		//long also stores integer values
		//Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		
		long l1 = 0;
		long l2 = -123;
		
		//byte also stores integer values
		//Stores whole numbers from -128 to +127
		
		byte b1 = -128;
		byte b2 = 127;
		
		//boolean stores true or false
		
		boolean b11 = true; //true is a condition
		boolean b12 = false; //false is also a condition
		
		boolean b13 = 1<2;  //this is also a codition
		
		
		//char stores a single entity within a single quote ' '
		
		char c1 = ' ';
		char c2 = '1';
		char c3 = 'A';
		char c4 = 'a';
		char c5 = '&';
		
		
		//double is used to store decimal values
		//Stores fractional numbers. Sufficient for storing 15 decimal digits
		
		double d1 = 123.456;
		double d2 = -0.454541;
				
		//float stores fraction numbers
		float f1 = 4.002f;
		
		//String
	    //String is a Class in itself
		//String is the God of all Classes in java
		
		String S1 = "Hello World";
		String S2 = new String("Hello World");
		
		//Array -  [] is one dimension, [][] is 2 dimension
		
		int[] array = new int[3];
		int[] array1 = {1,2,3,4,5};
		
		//Class
		
		DataTypes dt = new DataTypes();
		dt.sampleTest();
		
		DataTypes.crampTest();
	}
	
	
	public void sampleTest() {
		System.out.println(1 + 2);
	}
	
	public static void crampTest() {
		System.out.println("I am cramping");
	}

}
