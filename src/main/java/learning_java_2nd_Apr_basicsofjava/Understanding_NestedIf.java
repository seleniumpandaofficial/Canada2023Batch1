package learning_java_2nd_Apr_basicsofjava;

public class Understanding_NestedIf {

	public static void main(String[] args) {
		
		int i = 1;
		
		if(i<=2) {
			if(2<=3) {
				System.out.println("My inner if block logic is correct");
			}
			
			System.out.println("Outer if block logic is also correct");
		}
		
		System.out.println("-----------------------------------------------------");
		
		if(2<=3) {
			if(2>3) {
				System.out.println("My inner if block logic is correct");
			}
			System.out.println("Outer if block logic is correct");
		}

	}

}
