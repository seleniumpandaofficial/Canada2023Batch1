package java_Strings_30th_Apr_2023;

public class String_Immutability {

	//Mutants - they change
	//Immutability - this means cannot be changed
	//Immutability concept of Strings applies for String Objects
	//String objects are immutable
	//Once String objects are created, its data or state cannot be changed.
	
	//We have created a String object. If we try to change the state of a String Object, instead of changing the original object
	//It will create another Object
	public static void main(String[] args) {
		
		String S = new String("Apple");
		S.concat("Oranges");      //only trying to modify the String Object
		System.out.println(S);  //AppleOranges (totally wrong)  ---- Apple (right answer)
		
		S = S.concat("Oranges"); 
		System.out.println(S);
		
		
		String S1 = "Java";
		String S2 = "Java";
		String S3 = "Java";
		
		
		//String S51 = "Java";
		String S51 = "Python";
		
		
		
		
		String S50 = "Java";
		

	}

}
