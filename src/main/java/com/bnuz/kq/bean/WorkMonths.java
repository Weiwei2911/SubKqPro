package com.bnuz.kq.bean;

public class WorkMonths {
    private Integer mid;

    private String month;

    private String startday;

    private String endday;

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month == null ? null : month.trim();
    }

    public String getStartday() {
        return startday;
    }

    public void setStartday(String startday) {
        this.startday = startday == null ? null : startday.trim();
    }

    public String getEndday() {
        return endday;
    }

    public void setEndday(String endday) {
        this.endday = endday == null ? null : endday.trim();
    }
}