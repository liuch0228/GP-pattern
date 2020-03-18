package com.lchtest.pattern.decorator.logger;

import org.slf4j.Logger;

public class LoggerTest {
//    private static  final Logger logger = LoggerFactory.getLogger(LoggerTest.class);
    private static  final Logger logger = JsonLoggerFactory.getLogger(LoggerTest.class);
    public static void main(String[] args) {
        logger.info("打印info日志");
        logger.error("打印error日志");
        try{
            int i = 1/0;
        }catch (Exception e){
            logger.error("error occured.",e);
        }
    }
}
