package learning_java_10th_Apr_2023;

public class Student {

	String name; //default value of String is null
	int age;     //default value of int is 0
	String subject; //default value of String is null
	String dance;
	
	//do you think the 3rd way to write extra lines of code ?? is this an optimum approach ??
	
	
	public static void main(String[] args) {
		Student s1 = new Student("Tom", 9, "Science", "Kathak");
		System.out.println(s1.name + " --" + s1.age + " -- " + s1.subject + " -- " + s1.dance);
		
		Student s2 = new Student("Harry", 10, "Maths", "Odishi");
		System.out.println(s2.name + " --" + s2.age + " -- " + s2.subject + " -- " + s2.dance);
		
		Student s3 = new Student("Maria", 8, "English", "Bharatnatyam");
		System.out.println(s3.name + " --" + s3.age + " -- " + s3.subject + " -- " + s3.dance);
	}
	
	
	public Student(String name, int age, String subject, String dance) {
		this.name = name;
		this.age = age;
		this.subject = subject;
		this.dance = dance;
		
		//this keyword is used to instantiate current Class variables with the local variables in case the naming conventions are same
	}
	
	//Constructors
	//what is a constructor?
	
	//constructor is a block which looks like a method but it is not a method
	
	//what are the differences between a constructor and a method
	
	//constructor has the name of the Class but method can have any name
	//constructor does not have a return type but methods have a return type
	//constructors cannot be made static but methods can 
	//constructors cannot be inherited but methods can be
	//constructor is invoked the moment an object is created but that is not the case with method
	
	//constructors can use all the access modifiers - public, private, protected, default
	
	//use of constructor  - to optimize the code
	//use of constructor - used to initialize an object
	
	//types - default constructor (invoked the moment an object is created)
	//        no argument constructor - user defined
	//        parameterized constructor - user defined

}
