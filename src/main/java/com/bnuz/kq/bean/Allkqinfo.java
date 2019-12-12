package com.bnuz.kq.bean;

public class Allkqinfo {
    private Integer infoId;

    private String enrollnumber;

    private String name;

    private String time;

    private String hour;

    private String starttime;

    private String endtime;

    private String inoutmode;
    
    

    @Override
	public String toString() {
		return "Allkqinfo [infoId=" + infoId + ", enrollnumber=" + enrollnumber
				+ ", name=" + name + ", time=" + time + ", hour=" + hour
				+ ", starttime=" + starttime + ", endtime=" + endtime
				+ ", inoutmode=" + inoutmode + "]";
	}

	public Integer getInfoId() {
        return infoId;
    }

    public void setInfoId(Integer infoId) {
        this.infoId = infoId;
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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour == null ? null : hour.trim();
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

    public String getInoutmode() {
        return inoutmode;
    }

    public void setInoutmode(String inoutmode) {
        this.inoutmode = inoutmode == null ? null : inoutmode.trim();
    }
}