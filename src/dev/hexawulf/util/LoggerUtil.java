package dev.hexawulf.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerUtil {
    public static Logger getLogger(Class<?> clazz) {
        return LogManager.getLogger(clazz);
    }
}


/* Use anywhere in your project:
 * import dev.hexawulf.util.LoggerUtil; 
 * import org.apache.logging.log4j.Logger;
 * 
 * public class MyClass { private static final Logger logger =
 * LoggerUtil.getLogger(MyClass.class);
 * 
 * public static void main(String[] args) {
 * logger.info("Logging via LoggerUtil!"); } }
 */

/* Usage: logger.info("User logged in: {}", username);
logger.warn("Low disk space on {}", volume);
logger.error("Database connection failed", exception);
logger.debug("Debugging info: {}", debugInfo);
logger.trace("Trace message: {}", traceInfo);
logger.fatal("Critical error: {}", fatalError);
logger.info("User logged in: {}", username);
*/