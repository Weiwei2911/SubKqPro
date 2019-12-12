package com.bnuz.kq.bean;

public class Machineinfo {
    private Integer macId;

    private String macName;

    private String macIp;

    private String macPort;

    public Integer getMacId() {
        return macId;
    }

    public void setMacId(Integer macId) {
        this.macId = macId;
    }

    public String getMacName() {
        return macName;
    }

    public void setMacName(String macName) {
        this.macName = macName == null ? null : macName.trim();
    }

    public String getMacIp() {
        return macIp;
    }

    public void setMacIp(String macIp) {
        this.macIp = macIp == null ? null : macIp.trim();
    }

    public String getMacPort() {
        return macPort;
    }

    public void setMacPort(String macPort) {
        this.macPort = macPort == null ? null : macPort.trim();
    }
}