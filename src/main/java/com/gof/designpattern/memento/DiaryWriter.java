package com.gof.designpattern.memento;

import com.gof.designpattern.memento.basis.Diary;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yl3 on 10.12.15.
 */
public class DiaryWriter {

    private Map<String, Diary> diaryMap = new HashMap<String, Diary>();

    public void writeDiary(Diary diary) {
        diaryMap.put(diary.getDate(), diary);
    }

    public Diary getDiary(String date) {
        return diaryMap.get(date);
    }
}
