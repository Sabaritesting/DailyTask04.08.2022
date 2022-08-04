package Task7;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LocalDate dt=LocalDate.now();
System.out.println("Next Friday"+dt.with(TemporalAdjusters.next(DayOfWeek.FRIDAY)));
System.out.println("Previous Friday: "+dt.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY)));
	}

}
