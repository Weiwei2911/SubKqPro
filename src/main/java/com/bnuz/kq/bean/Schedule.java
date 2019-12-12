package com.bnuz.kq.bean;

public class Schedule {
    private String enrollnumber;

    private String name;

    private String workclass;

    public String getEnrollnumber() {
        return enrollnumber;
    }

    public void setEnrollnumber(String enrollnumber) {
        this.enrollnumber = enrollnumber == null ? null : enrollnumber.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getWorkclass() {
        return workclass;
    }

    public void setWorkclass(String workclass) {
        this.workclass = workclass == null ? null : workclass.trim();
    }
}