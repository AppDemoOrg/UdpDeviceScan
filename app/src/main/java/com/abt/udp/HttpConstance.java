package com.abt.udp;

/**
 * @描述： @HttpConstance
 * @作者： @黄卫旗
 * @创建时间： @09/08/2018
 */
public interface HttpConstance {

    String MODEL_AP = "3";
    String MODEL_RE = "2";

    String PORT = "2088";//默认upd广播端口号
    String MSG_DEV_SCAN = "SCAN_DEV_REQ";//设备发现,UDP广播

    int DEFAULT_UDP_TIMEOUT = 300000;

    int SCANING = 0;
    int SCAN_FAILD = 1;
    int SCAN_SUCCESS = 2;
    int SCAN_COMPLETE = 3;

}
