package com.gof.designpattern;

import com.gof.designpattern.memento.DiaryWriter;
import com.gof.designpattern.memento.basis.Diary;
import com.gof.designpattern.memento.basis.DiaryBook;

/**
 * Created by yl3 on 10.12.15.
 */
public class CommandCenter {

    public static void main(String[] args) {
        DiaryBook diaryBook = new DiaryBook();

        DiaryWriter diaryWriter = new DiaryWriter();

        diaryBook.setContent("Today is a wonderful day.");

        diaryWriter.writeDiary(diaryBook.generateDiary("2015-12-01", diaryBook.getContent()));

        diaryBook.setContent("Today is a good day.");

        diaryBook.setContent("Today is a bad day.");
        diaryWriter.writeDiary(diaryBook.generateDiary("2015-12-02", diaryBook.getContent()));

        diaryBook.setContent("Today is a normal day.");
        diaryWriter.writeDiary(diaryBook.generateDiary("2015-12-03", diaryBook.getContent()));


        diaryBook.getContentFromDiary(diaryWriter.getDiary("2015-12-01"));
        diaryBook.getContentFromDiary(diaryWriter.getDiary("2015-12-02"));
        diaryBook.getContentFromDiary(diaryWriter.getDiary("2015-12-03"));

    }
}
