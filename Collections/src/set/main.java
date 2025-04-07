package set;

import java.util.EnumSet;
import java.util.Set;

enum Day{
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class main {

	public static void main(String[] args) {
	 EnumSet<Day> weekdays = EnumSet.range(Day.MONDAY, Day.FRIDAY);
	 System.out.println(weekdays);
	}

}
