package com.coderising.payroll.payment.schedule;

import java.util.Date;

public interface PaymentSchedule {
	public boolean isPayDate(Date date);
	public Date getPayPeriodStartDate(Date payPeriodEndDate);
}
