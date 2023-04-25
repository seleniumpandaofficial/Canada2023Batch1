package learning_java_30th_Mar_basicsofjava;

public class Concatenation_Operator {

	public static void main(String[] args) {
		//concatenation is joining. This is represented in java by the + symbol
		
		System.out.println(1 + 2);
		int i = 25;
		int j = 30;
		String S1 = "Hello";
		String S2 = "World";
		System.out.println(S1 + S2);
		System.out.println(i+j+S1+S2);
		System.out.println(S1+S2+i+j);
		System.out.println(S1+S2+(i+j));

	}

}
