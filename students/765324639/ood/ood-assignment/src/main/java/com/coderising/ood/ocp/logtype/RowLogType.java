package com.coderising.ood.ocp.logtype;

import com.coderising.ood.ocp.logtype.LogType;

public class RowLogType implements LogType {

    @Override
    public String getTypeMsg(String msg) {
        return msg;
    }
}
