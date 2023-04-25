package learning_java_2nd_Apr_basicsofjava;
//Control Statements
//1. Selection or Conditional Statements
     // if, if else, if else if, nested if, switch
//2. Iteration or looping statements
     // while, for, nested for, for each loop, do while
//3. Jump statements
      //break, continue, return

public class ControlStatements {

	public static void main(String[] args) {
		
		//Selection or Conditional statements
		//they control the flow of program execution on the basis of the outcome of an expression(condition)
		//condition could be true or false
		
		
		if(1>2) {
			System.out.println("Grass is Green");
		}else if(true == false) {
			System.out.println("The logic in if is bogus");
		}else if(23<22) {
			System.out.println("This logic inside second else if might be true");
		}else {
			System.out.println("Nothing above is correct");
		}

	}

}
