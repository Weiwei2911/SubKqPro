package com.bnuz.kq.bean;

public class UserInfo {
    private String enrollnumber;

    private String name;

    private Integer privilege;

    private String password;

    public UserInfo(String name, String password1, Integer privilege1, String enrollNumber1) {
        this.name = name;
        password = password1;
        privilege = privilege1;
        enrollnumber = enrollNumber1;
    }
    
    public UserInfo() {
       
    }
    
    @Override
	public String toString() {
		return "UserInfo [enrollnumber=" + enrollnumber + ", name=" + name
				+ ", privilege=" + privilege + ", password=" + password + "]";
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

    public Integer getPrivilege() {
        return privilege;
    }

    public void setPrivilege(Integer privilege) {
        this.privilege = privilege;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}