package com.coderising.ood.ocp;

import com.coderising.ood.ocp.logsender.LogSender;
import com.coderising.ood.ocp.logtype.LogType;
import com.coderising.ood.ocp.util.DateUtil;
import com.coderising.ood.ocp.util.MailUtil;
import com.coderising.ood.ocp.util.SMSUtil;

public class Logger {
	private LogType logType;
	private LogSender logSender;

	public Logger(LogType logType, LogSender logSender) {
		this.logType = logType;
		this.logSender = logSender;
	}

	public void log(String msg){
		String logMsg = logType.getTypeMsg(msg);
		logSender.send(logMsg);
	}
}

