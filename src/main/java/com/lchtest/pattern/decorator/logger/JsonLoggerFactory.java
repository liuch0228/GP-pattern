package com.lchtest.pattern.decorator.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JsonLoggerFactory {
    public static JsonLogger getLogger(Class clazz){
        Logger logger = LoggerFactory.getLogger(clazz);
        // 将Logger接口的引用作为构造参数赋值给JsonLogger，返回的是被包装过的logger
        return new JsonLogger(logger);
    }
}
