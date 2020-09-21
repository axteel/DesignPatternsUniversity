package org.axteel.lab3observer;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class SimpleLogger {
    private static Logger logger;

    public static Logger getLogger(Class cls) {
        if (logger != null) {
            return logger;
        }

        logger = Logger.getLogger(cls.getName());

        Handler fileHandler = null;

        try {
            fileHandler = new FileHandler("default.log", true);
        } catch (IOException e) {
            e.printStackTrace();
        }

        assert fileHandler != null;

        fileHandler.setFormatter(new XMLFormatter());
        logger.addHandler(fileHandler);

        return logger;
    }
}
