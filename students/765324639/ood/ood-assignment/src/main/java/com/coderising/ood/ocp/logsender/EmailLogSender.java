package com.coderising.ood.ocp.logsender;

import com.coderising.ood.ocp.util.MailUtil;

public class EmailLogSender implements LogSender {

    @Override
    public void send(String msg) {
        MailUtil.send(msg);
    }
}
