/**
 * 
 */
package com.doj.app.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Dinesh.Rajput
 *
 */
public class LogbackExample {
	
	private static final Logger logger = LoggerFactory.getLogger(LogbackExample.class);

    public static void main(String[] args) {
        logger.debug("Debug log message");
        logger.info("Info log message");
        logger.error("Error log message");
    }
}
