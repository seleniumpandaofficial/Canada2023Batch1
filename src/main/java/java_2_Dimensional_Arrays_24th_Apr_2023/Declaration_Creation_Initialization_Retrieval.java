package java_2_Dimensional_Arrays_24th_Apr_2023;

public class Declaration_Creation_Initialization_Retrieval {
	
	//[][]

	public static void main(String[] args) {
		int[][] a; 
		int [][]a1;
		int[][]a2;
		int a3[][];
		int[]a4[];
		
		int[][] b, b1; //both b and b1 are 2-D arrays
		int[] c[], c1; //c is 2-D, c1 is 1-D
		int[] d[], d1[]; //d and d1 are 2-D
		//int[][]e, []e1; //law says that 2nd variable cannot have a dimension before it. It is allowed dimension after it

		int[][]f, f1[]; // f is 2-D, f1 is 3-D
		
		
		int[][] m = new int[2][3]; //2 is no of rows, 3 is no of cols
		
		m[0][0] = 11;
		m[0][1] = 22;
		m[0][2] = 33;
		
		m[1][0] = 44;
		m[1][1] = 55;
		m[1][2] = 66;
		
		//m[2][0] = 77;
		//m[2][1] = 88;
		//m[2][2] = 99;
		
		System.out.println(m.length);
		
		
		int[][] n = new int[][] {{11, 22, 33}, {44, 55, 66}};
		
		int[][] p = {{101, 102, 103}, {201, 202, 203}};
		
		String[][] credentials = {{"username1", "password1"},
				                  {"username2", "password2"}};
		
		
		for(int i=0 ; i<p.length ; i++) {
			for(int j=0 ; j<p[i].length ; j++) {
				System.out.print(p[i][j] + " ");
			}
			
			System.out.println();
		}
		
		System.out.println("***********************************************************");
		
		for(int i=0 ; i<credentials.length ; i++) {
			for(int j=0 ; j<credentials[i].length ; j++) {
				System.out.print(credentials[i][j] + " ");
			}
			
			System.out.println();
		}
		
		
		
	}

}
