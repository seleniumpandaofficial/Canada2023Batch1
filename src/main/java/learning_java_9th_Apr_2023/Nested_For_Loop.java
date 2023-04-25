package learning_java_9th_Apr_2023;

public class Nested_For_Loop {
	
	//for loop inside for loop
	//outer for loop - if it runs 1 time, inner for loop runs 5 times
	//outer for loop represents rows
	//inner for loop represents cols

	public static void main(String[] args) {
		

		for(int i=1 ; i<=5 ; i++) {
			System.out.println("For every iteration of the outer for loop or i : " + i );
			for(int j=1 ; j<=5 ; j++) {
				System.out.println(" i = " + i + ", j = " + j);
			}
			
		}
	}

}
