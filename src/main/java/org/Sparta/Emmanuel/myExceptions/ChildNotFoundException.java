package org.Sparta.Emmanuel.myExceptions;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class ChildNotFoundException extends Exception {

    public ChildNotFoundException(String text) {
        super(text);
        Logger logger = LogManager.getLogger();
        logger.error(text);
    }

}
