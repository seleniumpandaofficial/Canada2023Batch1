package date_Class;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;



public class DateConcepts {

	public static void main(String[] args) {
		
		//Create a new Date Object representing the current date and time
		Date currentDate = new Date();
		System.out.println("The current date is : " + currentDate);
		
		//epoch time ? January 1, 1970, 00:00:00 GMT
		long inMiliSeconds = currentDate.getTime();
		System.out.println("Mili Seconds since epochTime is : " + inMiliSeconds);
		System.out.println("Seconds since epochTime is : " + (inMiliSeconds/1000));
		
		//Get the year, month, day, hour - components of a date
		LocalDate localdate = LocalDate.now();
		int year = localdate.getYear();
		int month = localdate.getMonthValue();
		int day = localdate.getDayOfMonth();
		System.out.println("Year is : " + year + "---->" + " Month is :  " + month + " Day is : " + day);
		
		//Create a local time Object representing the current time
		LocalTime localtime = LocalTime.now();
		int hour = localtime.getHour();
		int minute = localtime.getMinute();
		int second = localtime.getSecond();
		System.out.println("Hour is : " + hour + "---->" + " minute is :  " + minute + " second is : " + second);
		
		//PastDate
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		Date myDate = new Date(System.currentTimeMillis());
		Date oneDayBefore = new Date(myDate.getTime() - 86400000);
		String dateStr = dateFormat.format(oneDayBefore);
		System.out.println("past date result is : " + dateStr);
		
		//How to convert date Object into String
		Date date1 = new Date();
		System.out.println(date1);
		String actualDate = date1.toString().replace(" ", "_").replace(":", "_");
		System.out.println(actualDate);
		
		//SimpleDateFormat
		//you have to create the object of this Class
		//in constructor MM/dd/yyy         EEEE, MMMM, dd, yyyy

	}

}
