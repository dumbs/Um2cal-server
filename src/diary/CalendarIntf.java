package diary;

import java.rmi.Remote;

public interface CalendarIntf extends Remote {
	Object getWeeklyCalendar();
	Object getMonthlyCalendar();
	Object getDailyCalendar();
}
