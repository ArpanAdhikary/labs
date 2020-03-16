package lab12.exercise2.bean;

import org.apache.log4j.Logger;

public class Message {

	private static Logger logger = Logger.getLogger(Message.class);
	
	private String msg;
	
	public void setMessage(String msg) {
		this.msg = msg;
		logger.debug("debug message");
		logger.info("info message");
		logger.warn("warn message");
		logger.error("error message");
		logger.fatal("fatal message");
	}
	
	public String getMessage() {
		logger.debug("debug message");
		logger.info("info message");
		logger.warn("warn message");
		logger.error("error message");
		logger.fatal("fatal message");
		return msg;
	}
}
