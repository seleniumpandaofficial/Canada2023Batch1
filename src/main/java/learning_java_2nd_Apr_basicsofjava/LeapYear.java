package learning_java_2nd_Apr_basicsofjava;

public class LeapYear {

	public static void main(String[] args) {
		int year1 = 1996;
		int year2 = 2000;
		int year3 = 2015;
		
		//determine which year(s) are leap year
		
		
		if((year1%400 == 0) || (year1 % 4 == 0 && year1 % 100 != 0)) {
			System.out.println("year1 is a leap year : " + year1);
		}else {
			System.out.println("year1 is not a leap year");
		}
		
		if((year2%400 == 0) || (year2 % 4 == 0 && year2 % 100 != 0)) {
			System.out.println("year2 is a leap year : " + year2);
		}else {
			System.out.println("year2 is not a leap year");
		}
		
		if((year3%400 == 0) || (year3 % 4 == 0 && year3 % 100 != 0)) {
			System.out.println("year2 is a leap year : " + year3);
		}else {
			System.out.println("year2 is not a leap year");
		}

	}

}
