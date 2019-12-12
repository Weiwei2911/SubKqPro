package com.bnuz.kq.bean;

public class LogData {
    private String enrollnumber;

    private String time;

    private String verifymode;

    private String inoutmode;
    
    private String inoutmode1;

    private String year;

    private String month;

    private String day;

    private String hour;

    private String minute;

    private String second;
    
   
    
    public LogData(String year1, String hour1, String inOutMode, String time2, String inOutMode1, String second1, String minute1, String enrollNumber, String day1, String month1, String verifyMode1) {
    	year = year1;
    	hour = hour1;
    	inoutmode = inOutMode;
    	time = time2;
    	setInoutmode1(inOutMode1);
    	second = second1;
    	minute = minute1;
    	enrollnumber = enrollNumber;
    	day = day1;
    	month = month1;
    	verifymode = verifyMode1;
    }
    
    @Override
	public String toString() {
		return "LogData [enrollnumber=" + enrollnumber + ", time=" + time
				+ ", verifymode=" + verifymode + ", inoutmode=" + inoutmode
				+ ", inoutmode1=" + inoutmode1 + ", year=" + year + ", month="
				+ month + ", day=" + day + ", hour=" + hour + ", minute="
				+ minute + ", second=" + second + "]";
	}

	public LogData(){
    	
    }
    
    

   

	public String getEnrollnumber() {
        return enrollnumber;
    }

    public void setEnrollnumber(String enrollnumber) {
        this.enrollnumber = enrollnumber == null ? null : enrollnumber.trim();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public String getVerifymode() {
        return verifymode;
    }

    public void setVerifymode(String verifymode) {
        this.verifymode = verifymode == null ? null : verifymode.trim();
    }

    public String getInoutmode() {
        return inoutmode;
    }

    public void setInoutmode(String inoutmode) {
        this.inoutmode = inoutmode == null ? null : inoutmode.trim();
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month == null ? null : month.trim();
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day == null ? null : day.trim();
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour == null ? null : hour.trim();
    }

    public String getMinute() {
        return minute;
    }

    public void setMinute(String minute) {
        this.minute = minute == null ? null : minute.trim();
    }

    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second == null ? null : second.trim();
    }

	public String getInoutmode1() {
		return inoutmode1;
	}

	public void setInoutmode1(String inoutmode1) {
		this.inoutmode1 = inoutmode1;
	}
}