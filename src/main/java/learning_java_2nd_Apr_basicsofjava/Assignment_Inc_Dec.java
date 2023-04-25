package learning_java_2nd_Apr_basicsofjava;

public class Assignment_Inc_Dec {

	public static void main(String[] args) {
		int i=1;
		--i;
		int j = --i - i-- - ++i;
		int k = j-- - --i + ++j - ++j + i--;
		int l = i-- - ++j - --j + k--;
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);

	}

}
