package com.bnuz.kq.bean;

public class MonReport {
    private String enrollnumber;

    private String name;

    private Integer trueNum;

    private Integer badNum;

    private Integer otHour;

    private Double normalWage;

    private Double dedWage;

    private Double otWage;

    private Double lastWages;
    
    

    @Override
	public String toString() {
		return "MonReport [enrollnumber=" + enrollnumber + ", name=" + name
				+ ", trueNum=" + trueNum + ", badNum=" + badNum + ", otHour="
				+ otHour + ", normalWage=" + normalWage + ", dedWage="
				+ dedWage + ", otWage=" + otWage + ", lastWages=" + lastWages
				+ "]";
	}

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

    public Integer getTrueNum() {
        return trueNum;
    }

    public void setTrueNum(Integer trueNum) {
        this.trueNum = trueNum;
    }

    public Integer getBadNum() {
        return badNum;
    }

    public void setBadNum(Integer badNum) {
        this.badNum = badNum;
    }

    public Integer getOtHour() {
        return otHour;
    }

    public void setOtHour(Integer otHour) {
        this.otHour = otHour;
    }

    public Double getNormalWage() {
        return normalWage;
    }

    public void setNormalWage(Double normalWage) {
        this.normalWage = normalWage;
    }

    public Double getDedWage() {
        return dedWage;
    }

    public void setDedWage(Double dedWage) {
        this.dedWage = dedWage;
    }

    public Double getOtWage() {
        return otWage;
    }

    public void setOtWage(Double otWage) {
        this.otWage = otWage;
    }

    public Double getLastWages() {
        return lastWages;
    }

    public void setLastWages(Double lastWages) {
        this.lastWages = lastWages;
    }
}