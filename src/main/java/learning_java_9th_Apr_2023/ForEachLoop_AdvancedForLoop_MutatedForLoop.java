package learning_java_9th_Apr_2023;

public class ForEachLoop_AdvancedForLoop_MutatedForLoop {
	//they work best with Collection

	public static void main(String[] args) {
		char[] viowels = {'a', 'e', 'i', 'o', 'u'};
		
		for(char item : viowels ) {
			System.out.print(item + " ");
		}
		
		System.out.println();
		
		
		int[] numbers = {1, 2, 3, 4, 5};
		//print all the numbers as well as add them
		int sum = 0;
		for(int item : numbers) {
			System.out.print(item + " ");
			sum = sum + item;
			
		
		}
		
		System.out.println();
		System.out.println("the sum of the array elements are : " + sum);

	}

}
