package java_Strings_30th_Apr_2023;

public class String_MemoryLocations {
	//What are the 5 memory locations in java ?
	
	//1. Heap Memory - SCP/SLP is part of Heap Area
	//2. Stack Memory
	//3. PC Register
	//4. Method area
	//5. Native Method area

	public static void main(String[] args) {
	//Whenever you create an Object using new keyword, the object is stored inside the Heap Memory
		
		String S1 = new String();
		
		String S2 = new String("Java"); 
		//1 object will be created in Heap Memory because of new keyword
		//1 object will be created in SCP/SLP because of the literal "Java" passed in the constructor
		
		String S3 = new String("Python");
		//1 object will be created in Heap Memory because of new keyword
		//1 object will be created in SCP/SLP because of the literal "Python" passed in the constructor
		
		String S4 = "C++";
		//1 object will be created only in the SCP/SLP Memory
		
		String S5 = "Java";
		//0 object will be created in the SCP/SLP Memory
		
		String S6 = "Python";
		//0 object will be created

	}

}
