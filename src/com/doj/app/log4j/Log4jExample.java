/**
 * 
 */
package com.doj.app.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Dinesh.Rajput
 *
 */
public class Log4jExample {
	
	private static Logger logger = LogManager.getLogger(Log4jExample.class);
	 
    public static void main(String[] args) {
    	logger.trace("Trace log message");
        logger.debug("Debug log message");
        logger.info("Info log message");
        logger.error("Error log message");
    }
}
