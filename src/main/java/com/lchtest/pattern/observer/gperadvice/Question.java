package com.lchtest.pattern.observer.gperadvice;

/**
 * 问题有提问者和问题内容
 */
public class Question {
    private String userName;
    private String content;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
