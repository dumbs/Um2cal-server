package diary;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Calendar extends UnicastRemoteObject implements CalendarIntf {

	private static final long serialVersionUID = 4488842154143810144L;

	protected Calendar() throws RemoteException {
		super();
	}	
	
	@Override
	public Object getDailyCalendar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getMonthlyCalendar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getWeeklyCalendar() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
