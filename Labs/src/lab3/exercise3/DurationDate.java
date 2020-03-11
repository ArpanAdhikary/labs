package lab3.exercise3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DurationDate {

	@SuppressWarnings("deprecation")
	public void diffDate() {
		Date date = new Date();
		Calendar cal=Calendar.getInstance();
		System.out.println(cal.MONTH);
		long days=date.getTime()/(24*60*60*1000);
		//SimpleDateFormat formatter = new SimpleDateFormat("dd/mmm/yyyy");
		//String strDate= formatter.format(date);
		System.out.println(days);
		//Date d=new Date(1997,3,23);  
        //Date d1=new Date(2018,9,21);  
        //int comparison=date.compareTo(d1);  
        //System.out.println("Your comparison value is : "+comparison);  
	}
	public static void main(String[] args) {
		
		DurationDate obj = new DurationDate();
		obj.diffDate();
	}

}
