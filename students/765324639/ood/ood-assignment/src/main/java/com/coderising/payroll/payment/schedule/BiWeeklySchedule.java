package com.coderising.payroll.payment.schedule;

import com.coderising.payroll.payment.schedule.PaymentSchedule;
import com.coderising.payroll.utils.DateUtil;
import java.util.Date;
import org.apache.commons.lang3.time.DateUtils;

/**
 * 每隔一周的周五支付
 */
public class BiWeeklySchedule implements PaymentSchedule {
    Date firstPayableFriday = DateUtil.parseDate("2017-6-2");

    @Override
    public boolean isPayDate(Date date) {
        long interval = DateUtil.getDaysBetween(firstPayableFriday, date);
        return interval % 14 == 0;
    }

    @Override
    public Date getPayPeriodStartDate(Date payPeriodEndDate) {
        return DateUtil.add(payPeriodEndDate, -14);
    }
}
