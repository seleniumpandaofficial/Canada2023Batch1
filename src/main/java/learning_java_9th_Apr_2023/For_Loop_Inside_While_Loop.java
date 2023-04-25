package learning_java_9th_Apr_2023;

public class For_Loop_Inside_While_Loop {

	// While loop is the outer for loop
	// for loop is the inner for loop

	public static void main(String[] args) {

		int i = 1;
		while (i <= 5) {
			System.out.println("The repitition for i is :" + i);
			for (int j = 1; j <= 5; j++) {
				System.out.println("i = " + i + ",: j = " + j);
				
			}
			i = i + 1;
		}
	}

}
