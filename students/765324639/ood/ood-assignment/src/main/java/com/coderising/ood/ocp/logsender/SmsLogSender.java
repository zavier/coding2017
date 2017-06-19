package com.coderising.ood.ocp.logsender;


import com.coderising.ood.ocp.util.SMSUtil;

public class SmsLogSender implements LogSender {

    @Override
    public void send(String msg) {
        SMSUtil.send(msg);
    }
}
