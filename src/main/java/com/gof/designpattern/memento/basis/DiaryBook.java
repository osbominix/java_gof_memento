package com.gof.designpattern.memento.basis;

/**
 * Created by yl3 on 10.12.15.
 */
public class DiaryBook {

    private String content;

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public Diary generateDiary(String date, String content) {
        return new Diary(date, content);
    }

    public void getContentFromDiary(Diary diary) {
        System.out.println(diary.getContent());
    }

}
