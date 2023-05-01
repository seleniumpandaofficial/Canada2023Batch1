package final_finally_finalize;

final public class Final_Concept {

	// final is a keyword in java which means once it is applied there are certain
	// restrictions applied to those entities
	// final can be applied to variables, methods, Classes

	// can I override a final method present in Parent Class ?? //No

	// a final parent class cannot be inherited. Cannot be extended

	public static void main(String[] args) {
		final int i = 10;
		System.out.println(i);
	}

	final public void sum() {
		// parent sum logic
	}

}

/*
 * class Test extends Final_Concept {
 * 
 * 
 * public void sum() { //child sum logic - method overriding }
 * 
 * }
 */
