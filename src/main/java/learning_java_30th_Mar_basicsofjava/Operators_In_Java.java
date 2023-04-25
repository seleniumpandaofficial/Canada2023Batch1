package learning_java_30th_Mar_basicsofjava;

public class Operators_In_Java {
	
	//Arithmetic Operators
	//Assignment Operators
	//Comparison Operators
	//Logical Operators
	//Bitwise Operators

	public static void main(String[] args) {
		
		//Arithmetic Operators
		//  +,  -,  *,   /,  %, ++, --
		
		//Assignment Operators
		// =, += , -= , *=, /= , %= , &=, != , ^=, >>=, <<= 
		
		//Comparison Operators
		// ==, != , > , < , >= , <=
		
		//Logical Operators
		//        && - Logical and
		//        || - Logical OR
		//         ! - Logical not
		
		execution();
	}
	
	
	public static void execution() {
		int i=2; 
		int j=3;
		System.out.println(i+j);
		
		int k = 10;
		int l = 3;
		System.out.println(k%l);
		
		String S1 = "Hello World1";
		String S2 = "Hello World";
		System.out.println(S1 != S2);
		
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1 != b2);
	}

}
