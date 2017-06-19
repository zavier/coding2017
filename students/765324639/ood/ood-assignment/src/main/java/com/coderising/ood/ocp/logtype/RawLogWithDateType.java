package com.coderising.ood.ocp.logtype;

import com.coderising.ood.ocp.logtype.LogType;
import com.coderising.ood.ocp.util.DateUtil;

public class RawLogWithDateType implements LogType {

    @Override
    public String getTypeMsg(String msg) {
        String txtDate = DateUtil.getCurrentDateAsString();
        String logMsg = txtDate + ": " + msg;
        return logMsg;
    }
}
