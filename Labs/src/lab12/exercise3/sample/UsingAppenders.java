package lab12.exercise3.sample;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class UsingAppenders {

	private static Logger logger = Logger.getLogger(UsingAppenders.class);
	
	public static void main(String args[]) {
		PropertyConfigurator.configure("C:\\Sashank\\Training\\Module 1\\CoreJava\\LoggerFundamentals\\src\\lab12\\exercise3\\appenders.properties");
			for(int i=0;i<50000;i++) {
				System.out.println();
				logger.debug("This is my debug message. Counter = " + i);
				logger.info("This is my info message. Counter = " + i);
				logger.warn("This is my warn message. Counter = " + i);
				logger.error("This is my error message. Counter = " + i);
				logger.fatal("This is my fatal message. Counter = " + i);
				
		}
	}
	
}
