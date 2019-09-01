package com.gupaoedu.vip.pattern.strategy.pay;

public class MessageResult {
    private  int code;
    private Object data;
    private String msg;

    public MessageResult(int code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "支付状态["+ code+"]" +
                ",交易详情 :" + data +
                ",data=" + data +
                ",msg=" + msg;
    }
}
