package com.gof.designpattern.memento.basis;

/**
 * Created by yl3 on 10.12.15.
 */
public class Diary {

    private String date;
    private String content;

    public Diary(String date, String content) {
        this.date = date;
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public String getContent() {
        return content;
    }
}
