package learning_java_2nd_Apr_basicsofjava;

public class Increment_Decrement_Operator {

	public static void main(String[] args) {
		
		//pre-increment    ++i 
		//post increment   i++
		//pre decrement    --i
		//post decrement   i--
		
		int i=1; //latest value of i is 1
		i++;     //latest value of i is 2
		System.out.println(i); //2
		++i;     //latest value of i is 3
		System.out.println(i); //3
		
		System.out.println("-------------------------------------");
		
		int j = 2; //latest value of j is 2
		--j;   //latest value of j is 1
		System.out.println(j); 
		j--;  //latest value of j is 0
		System.out.println(j);
		

	}

}
