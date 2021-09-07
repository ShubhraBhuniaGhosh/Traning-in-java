import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class DemoDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date now = new Date();
		System.out.println(now);
		Date old = new Date(0);
		System.out.println(old);
		System.out.println(old.toString());
		long time = now.getTime();
		System.out.println(time);
		System.out.println(old.getTime());
		now.setTime(time+86400); /* you can change this date by passing number of milli-secs */
		//Calendar c= new Calendar();
		Calendar c = Calendar.getInstance(); // Eg of factory pattern we have been using so far.
		c.setTime(now);
		c.add(Calendar.MONTH, 1); /* MONTH is a static and a constant*/


		System.out.println(c.getTime());
		DateFormat format = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println(format.format(now));
		
	}

}
