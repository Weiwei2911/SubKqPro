package com.bnuz.kq.bean;

import java.util.Date;

public class Mackqdata {
    private Integer dataId;

    private String macName;

    private Integer kqNum;

    private String empName;

    private Date workTime;

    private Date endTime;

    private Integer workNote;

    public Integer getDataId() {
        return dataId;
    }

    public void setDataId(Integer dataId) {
        this.dataId = dataId;
    }

    public String getMacName() {
        return macName;
    }

    public void setMacName(String macName) {
        this.macName = macName == null ? null : macName.trim();
    }

    public Integer getKqNum() {
        return kqNum;
    }

    public void setKqNum(Integer kqNum) {
        this.kqNum = kqNum;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    public Date getWorkTime() {
        return workTime;
    }

    public void setWorkTime(Date workTime) {
        this.workTime = workTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getWorkNote() {
        return workNote;
    }

    public void setWorkNote(Integer workNote) {
        this.workNote = workNote;
    }
}