package com.bnuz.kq.test;

import com.jacob.activeX.ActiveXComponent;

public class MacConnect {
	private static ActiveXComponent zkem = new ActiveXComponent("zkemkeeper.ZKEM.1");

    /**
     * 链接考勤机
     *
     * @param address 考勤机地址
     * @param port 端口号
     * @return
     */
    public boolean connect(String address, int port) {
        boolean result = zkem.invoke("Connect_NET", address, port).getBoolean();
        return result;
    }

    /**
     * 断开考勤机链接
     */
    public void disConnect() {
        zkem.invoke("Disconnect");
    }

    public static void main(String[] args) {
    	MacConnect sdk = new MacConnect();
        boolean  connFlag = sdk.connect("172.31.44.5", 4370);
        System.out.println("conn:"+connFlag);
    }
    
    
}
