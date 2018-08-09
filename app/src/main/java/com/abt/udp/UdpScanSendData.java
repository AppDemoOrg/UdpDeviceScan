package com.abt.udp;

/**
 * @描述： @UdpScanSendData
 * @作者： @黄卫旗
 * @创建时间： @09/08/2018
 */
public class UdpScanSendData {

    private String IP;
    private String port;
    private String msgType;

    public UdpScanSendData(String IP) {
        this.IP = IP;
        this.port = HttpConstance.PORT;
        this.msgType = HttpConstance.MSG_DEV_SCAN;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

}
