package java_OOPS_16th_Apr_2023;

public class Understand_Objects {
	
	//Object is instance of a concrete Class
	//Object is instance of a class - this definition will not be valid if the class is Abstract
	
	//What is meaning of the word instance in real life and in coding ??
	
	//Coding - if some entity is trying to hide the logic then it will not allow any reference points. That means it will not
	//         allow itself to instantiate
	
	//Object is a physical entity. So it occupies memory space. 
	//it will have properties
	//    Identity (name)
	//    State (breed / color / age)
	//    Behavior (barking / eating / sleeping / running/ guarding)
	
	//Do you think Categorization of an Object is simpler than a Class ? Yes
	
	//How to create Objects in JAVA?
	//1. new keyword - we will use this only
	//2. newInstance() method
	//3. clone()
	//4. deserialization
	//5. factory methods
	
	
	//what is object - Object is collection of all non-static entities of the Class
	
	String name;
	int age;
	String employeeDepartment;

	public static void main(String[] args) {
		
		Understand_Objects objref = new Understand_Objects();
		
		
	}
	
	public void display() {
		
	}

}
