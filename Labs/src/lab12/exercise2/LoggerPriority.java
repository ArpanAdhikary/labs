package lab12.exercise2;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import lab12.exercise2.bean.Message;

public class LoggerPriority {

	private static Logger logger = Logger.getLogger(LoggerPriority.class);
	
	public static void main(String args[]) {
		
		PropertyConfigurator.configure("C:\\Sashank\\Training\\Module 1\\CoreJava\\LoggerFundamentals\\src\\lab12\\exercise2\\loggerPriority.properties");
		Message message = new Message();
		message.setMessage("Hello");
		System.out.println(message.getMessage());
		
		logger.debug("debug message");
		logger.info("info message");
		logger.warn("warn message");
		logger.error("error message");
		logger.fatal("fatal message");
		
	}
}
