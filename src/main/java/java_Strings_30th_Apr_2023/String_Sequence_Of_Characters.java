package java_Strings_30th_Apr_2023;

public class String_Sequence_Of_Characters {

	public static void main(String[] args) {
	
		char[] c = {'S', 'e', 'l', 'e', 'n', 'i', 'u', 'm'};
		
		String S1 = new String(c);
		System.out.println(c);
		
		String S2 = "Selenium";
		System.out.println(S2);
		
		String S3 = new String("Selenium");
		System.out.println(S3);
		
		String S4 = "$#@!@112232Fs";
		System.out.println(S4);
		char[] c1 = { '$', '#', '@', '!', '@', '1', '1', '2', '2', '3', '2', 'F', 's'};
		
		String S5 = new String(c1);
		System.out.println(c1);

	}

}
