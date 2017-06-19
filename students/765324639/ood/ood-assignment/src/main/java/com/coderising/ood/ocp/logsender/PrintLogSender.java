package com.coderising.ood.ocp.logsender;

import com.coderising.ood.ocp.logsender.LogSender;

public class PrintLogSender implements LogSender {

    @Override
    public void send(String msg) {
        System.out.println(msg);
    }
}
