//code to return current date with day
import java.util.Calendar;
import java.util.Scanner;
class Caldate {
	private int day;
	private int month;
	private int year;
	public Caldate ()
	{
		System.out.println("Date( )");
		Calendar c=Calendar.getInstance();
		day=c.get(Calendar.DATE);
		month=c.get(Calendar.MONTH)+1;
		year=c.get(Calendar.YEAR);
	}
	public void printrecord()
	{
		System.out.println("Day:"+this.day);
		System.out.println("Month:"+this.month);
		System.out.println("Year:"+this.year);
		Calendar cal = Calendar.getInstance();
		cal.set(this.year, this.month - 1, this.day); // month is 0-based

		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		String dayName = "";

		switch (dayOfWeek) {
			case Calendar.SUNDAY:
				dayName = "Sunday";
				break;
			case Calendar.MONDAY:
				dayName = "Monday";
				break;
			case Calendar.TUESDAY:
				dayName = "Tuesday";
				break;
			case Calendar.WEDNESDAY:
				dayName = "Wednesday";
				break;
			case Calendar.THURSDAY:
				dayName = "Thursday";
				break;
			case Calendar.FRIDAY:
				dayName = "Friday";
				break;
			case Calendar.SATURDAY:
				dayName = "Saturday";
				break;
		}

		System.out.println("Day of the week: " + dayName);
	}

	public static void main(String[] args) {
		Caldate d;

		if (args.length == 3) {
			int day = Integer.parseInt(args[0]);
			int month = Integer.parseInt(args[1]);
			int year = Integer.parseInt(args[2]);
			d = new Caldate();
		} else {
			d = new Caldate(); // fallback to current date
		}

		d.printrecord();
	}
}