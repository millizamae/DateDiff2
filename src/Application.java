import java.util.Calendar; 

public class Application {

	public static void main(String[] args) {
		
		// creating a Calendar object and setting the date 
		Calendar calendar1 = Calendar.getInstance();
		calendar1.set(1990, 10, 06);
		
		// creating a 2nd Calendar object 
		Calendar calendar2 = Calendar.getInstance();
		calendar2.set(1986, 6, 20);
		
		//retrieve milliseconds format of dates above 
		long date1 = calendar1.getTimeInMillis(); 
		long date2 = calendar2.getTimeInMillis();
		
		//get the difference between date1 and date2 in seconds 
		long diffInSec = (date1-date2)/1000;
		
		int dayInSec = (60*60*24);
		int monthInSec = (30*dayInSec); // this is assuming that every month is 30 days 
		int yearInSec = (365*dayInSec); // this is assuming every year is 365 days (no leap years)
		int numberOfDays= 0;
		int numberOfMonths= 0;
		int numberOfYears= 0;
		
		while (diffInSec >= yearInSec){
		
			diffInSec = diffInSec-yearInSec;
			numberOfYears = numberOfYears +1;
			
		}
		
		while (diffInSec >= monthInSec){
			
			diffInSec = diffInSec-monthInSec;
			numberOfMonths = numberOfMonths +1;
		} 
		
		while (diffInSec >= 0){
			
			diffInSec = diffInSec-dayInSec;
			numberOfDays = numberOfDays +1; 
		}
		
		System.out.println(numberOfYears + " years," + numberOfMonths + " months,"+ numberOfDays + " days.");
		
	}
}