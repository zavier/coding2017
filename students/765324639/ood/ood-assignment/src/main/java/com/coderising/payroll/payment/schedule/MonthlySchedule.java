package com.coderising.payroll.payment.schedule;

import com.coderising.payroll.payment.schedule.PaymentSchedule;
import com.coderising.payroll.utils.DateUtil;
import java.util.Date;

/**
 * 每月最后一天支付
 */
public class MonthlySchedule implements PaymentSchedule {

    @Override
    public boolean isPayDate(Date date) {
        return DateUtil.isLastDayOfMonth(date);
    }

    @Override
    public Date getPayPeriodStartDate(Date payPeriodEndDate) {
        return DateUtil.getFirstDay(payPeriodEndDate);
    }
}
