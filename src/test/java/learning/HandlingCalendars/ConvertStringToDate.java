package learning.HandlingCalendars;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertStringToDate {

	public static void main(String[] args) throws ParseException {
		String date = "09/12/2022";
		// convert a text format date to an actual date format
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date formatDate = sdf.parse(date);
		System.out.println(formatDate);
		// get the day from the date
		String getDay = new SimpleDateFormat("dd").format(formatDate);
		int day = Integer.parseInt(getDay);
		System.out.println("Day number is: " + day);
		// get month from the date in different formats - MM, MMMM
		String getMonth = new SimpleDateFormat("MM").format(formatDate);
		int month = Integer.parseInt(getMonth);
		System.out.println("Month is: " + month);
		String getMonth1 = new SimpleDateFormat("MMMM").format(formatDate);
		System.out.println("Month Name is: " + getMonth1);
		String getMonth2 = new SimpleDateFormat("MMM").format(formatDate);
		System.out.println("Month with short name: " + getMonth2);
		// get the year from the date
		String getYear = new SimpleDateFormat("YYYY").format(formatDate);
		int year = Integer.parseInt(getYear);
		System.out.println("Year from the date is: " + year);
	}

}
