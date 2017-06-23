package uet.vnu.java.spring.model;

import java.sql.Date;

import javax.validation.constraints.NotNull;

public class Todo {
	
	private int id;

    @NotNull
    private int userid;

    @NotNull
    private String job;

    @NotNull
    private Date date;

    private Boolean isDone;

    public Todo() {
    }

    public Todo(int id, int userid, String job, Date date, Boolean isDone) {
        this.id = id;
        this.userid = userid;
        this.job = job;
        this.date = date;
        this.isDone = isDone;
    }
    public Todo(int userid, String job, Date date, Boolean isDone) {
        this.userid = userid;
        this.job = job;
        this.date = date;
        this.isDone = isDone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Boolean getDone() {
        return isDone;
    }

    public void setDone(Boolean done) {
        isDone = done;
    }

    @Override
    public String toString() {
        return String
                .format("ToString - Todo [id=%s, user=%s, desc=%s, targetDate=%s, isDone=%s]",
                        id, userid, job, date, isDone);
    }
	
}
