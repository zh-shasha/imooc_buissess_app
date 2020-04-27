package com.example.testapplication;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Unique;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class NoteConsumeMsg {
    @Id
    private Long id;
    @Unique
    private String noteTime;
    @Generated(hash = 1833987640)
    public NoteConsumeMsg(Long id, String noteTime) {
        this.id = id;
        this.noteTime = noteTime;
    }
    @Generated(hash = 739820676)
    public NoteConsumeMsg() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNoteTime() {
        return this.noteTime;
    }
    public void setNoteTime(String noteTime) {
        this.noteTime = noteTime;
    }
}
