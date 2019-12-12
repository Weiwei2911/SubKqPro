package com.bnuz.kq.bean;

public class SetSche {
    private Integer classid;

    private String workclass;

    private String starttime;

    private String endtime;

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public String getWorkclass() {
        return workclass;
    }

    public void setWorkclass(String workclass) {
        this.workclass = workclass == null ? null : workclass.trim();
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime == null ? null : starttime.trim();
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime == null ? null : endtime.trim();
    }
}