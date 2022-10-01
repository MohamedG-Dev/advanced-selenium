package learning.HandlingCalendars;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertMonthNametoMonthNumber {

	public static void main(String[] args) throws ParseException {
		String monthName = "September";
		SimpleDateFormat sdf = new SimpleDateFormat("MMMM");
		Date month = sdf.parse(monthName);
		String getMonthNumber = new SimpleDateFormat("MM").format(month);
		int monthNumber = Integer.parseInt(getMonthNumber);
		System.out.println(monthNumber);

	}

}
