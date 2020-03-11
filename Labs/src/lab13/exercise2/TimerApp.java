package lab13.exercise2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

class TimerThread implements Runnable{
		
		@Override
		public void run() {
			while(true)
			{						
				try {
					Date date = new Date();
					SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
					 System.out.println("Current Time: "+sdf.format(date));
				Thread.sleep(10000);
				}catch (InterruptedException e) {
					System.out.println(e);
				}
			}
		}
	}


	class TimerApp{
		
	public static void main(String[] args) {
		
		TimerThread task = new TimerThread();									// task									
		Thread th = new Thread(task);	
		// Worker	
			th.start();														//runnable state	
		
	}
}

