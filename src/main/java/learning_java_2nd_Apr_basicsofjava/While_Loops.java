package learning_java_2nd_Apr_basicsofjava;

public class While_Loops {
	
	//Step 1 - initialize value
	//Step 2 - condition
	//Step 3 - increment/decrement ++ or --
	//Step 4 - if need arise, control your logic by using jump statements

	public static void main(String[] args) {
		
		int i=1;
		
		while(i != 0) {
			System.out.println(i);  //1 will be printed
			i--; //i becomes 0
			
			break;
		}
		
		//write a while loop to print numbers from 0 to 10
		
		int j=0;
		while(j<11) {
			System.out.print(j + " "); //0 1 2 ........ 10
			j++; //1, 2,.....,11
		}
		
		//write a while loop to print first 10 multiples of 5
		//5, 10, 15, 20,......50
		
		//write a while loop to print first 10 multiples of 5 and add the multiples and give the sum
		//5, 10, 15, 20,......50
		//5 + 10 + ..... + 50 = ?
		
		//write a while loop to print first number as 99 and multiple of 11 in descending way
		//99, 88, 77, 66, 55, 44, 33, 22, 11, 1
		//sum
		

	}

}
