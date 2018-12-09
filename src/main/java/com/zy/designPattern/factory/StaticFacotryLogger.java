package com.zy.designPattern.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StaticFacotryLogger {

    private static final Logger RUN_LOGGER = getLogger("RUN_LOGGER");

    private static Logger getLogger(String name){
        return LoggerFactory.getLogger(name);
    }

    public static Logger getRunLogger(){
        return RUN_LOGGER;
    }

}
