package java_1_Dimensional_Arrays_24th_Apr_2023;

public class Retrieval_Arrays {

	public static void main(String[] args) {
		
		int[] a = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		
		
		String[] S = {"Java", "Python", "Javascript", "Perl", "C++", "Ruby", "PHP", "AngularJS"};
		
		
		//to retrieve all the elements of both the arrays
		
		for(int i=0 ; i<a.length ; i++) {
			System.out.print(a[i] + " ");
		}
		
		
		System.out.println();
		
		//I want a specific element from a specific position
		
		System.out.println("The integer element in 7th position is :" + a[6]);
		
		for(int i=0 ; i<S.length ; i++) {
			System.out.print(S[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("The String element in 4th position is :" + S[3]);
	}

}
