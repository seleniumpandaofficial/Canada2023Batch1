package learning_java_2nd_Apr_basicsofjava;

public class ForLoop {

	public static void main(String[] args) {

//for(initialize ; condition ; inc/dec) {
		// body ka logic
		// }

		// print numbers from 1 to 10

		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " "); // 1 2 ......10
		}

		System.out.println();
		// print numbers from 20 to 10 using for loop

		for (int i = 20; i >= 10; i--) {
			System.out.print(i + " ");
		}

	}

}
