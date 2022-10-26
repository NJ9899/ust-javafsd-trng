package sba;

import org.apache.log4j.Logger;

import org.apache.log4j.BasicConfigurator;

public class sba6 {

	static Logger log = Logger.getLogger(sba6.class);
	public static void main(String[] args) {
		BasicConfigurator.configure();
		log.warn("Warning message");
		log.error("Error message");
		log.fatal("fatal message");
		log.info("Print info");
		log.debug("Debug message");
		log.trace("trace message");
		

	}

}
