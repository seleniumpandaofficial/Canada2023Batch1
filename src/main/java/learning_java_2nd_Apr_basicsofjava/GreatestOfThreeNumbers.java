package learning_java_2nd_Apr_basicsofjava;

public class GreatestOfThreeNumbers {

	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		int k = 30;
		
		if(i>j && i>k) {
			System.out.println("i is the greatest : " + i);
		}else if (j>i && j>k) {
			System.out.println("j is the greatest : " + j);
		}else {
			System.out.println("k is the greatest :" + k);
		}

	}

}
