package org.Sparta.Emmanuel.myExceptions;

import org.Sparta.Emmanuel.Main;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log

{

    private static Logger logger = LogManager.getLogger(Main.class);

    

        public void runLogger()

        {
            logger.trace("This is a trace message");
            logger.debug("This is a debug message");
            logger.info("This is an info message");
            logger.warn("This is a warn message");
            logger.error("This is an error message");
            logger.fatal("This is a fatal message");
        }
}


