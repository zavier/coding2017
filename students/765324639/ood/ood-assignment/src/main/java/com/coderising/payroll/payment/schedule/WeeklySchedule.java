package com.coderising.payroll.payment.schedule;

import com.coderising.payroll.payment.schedule.PaymentSchedule;
import com.coderising.payroll.utils.DateUtil;
import java.util.Date;
import org.apache.commons.lang3.time.DateUtils;

/**
 * 每周五支付
 */
public class WeeklySchedule implements PaymentSchedule {

    @Override
    public boolean isPayDate(Date date) {
        return DateUtil.isFriday(date);
    }

    @Override
    public Date getPayPeriodStartDate(Date payPeriodEndDate) {
        return DateUtil.add(payPeriodEndDate, -7);
    }
}
