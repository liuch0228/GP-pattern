package com.gupaoedu.vip.pattern.decorator.logger;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;

import java.util.Arrays;

/**
 * 具体的装饰类，将日志打印封装成为json格式输出
 */
public class JsonLogger extends LoggerDecorator {
    public JsonLogger(Logger logger) {
        super(logger);
    }

    @Override
    public void info(String msg) {
        JSONObject result = newJsonObject();
        result.put("message", msg);
        logger.info(result.toString());
    }

    @Override
    public void error(String msg) {
        JSONObject result = newJsonObject();
        result.put("message", msg);
        logger.error(result.toString());
    }

    @Override
    public void error(String msg, Throwable t) {
        JSONObject result = newJsonObject();
        result.put("message", msg);
        if (t instanceof Exception) {
            Exception ex = (Exception) t;
            result.put("exception", ex.getClass().getName());
            String trace = Arrays.toString(ex.getStackTrace());
            result.put("starckTrace", trace);
        }
        logger.error(result.toString());
    }

    private JSONObject newJsonObject() {
        return new JSONObject();
    }
}
