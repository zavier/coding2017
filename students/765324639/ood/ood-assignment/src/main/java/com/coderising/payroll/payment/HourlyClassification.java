package com.coderising.payroll.payment;

import com.coderising.payroll.Paycheck;
import com.coderising.payroll.utils.DateUtil;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class HourlyClassification implements PaymentClassification {
    private double rate;
    private Map<Date, TimeCard> timeCards;

    public void addTimeCard(TimeCard tc) {
        timeCards.put(tc.getDate(), tc);
    }

    @Override
    public double calculatePay(Paycheck pc) {
        double totalPay = 0;
        for (TimeCard tc : timeCards.values()) {
            if (DateUtil.between(tc.getDate(), pc.getPayPeriodStartDate(), pc.getPayPeriodEndDate())) {
                totalPay += calculatePayForTimeCard(tc);
            }
        }
        return totalPay;
    }

    private double calculatePayForTimeCard(TimeCard tc) {
        int hours = tc.getHours();
        if (hours > 8) {
            return 8 * rate + (hours - 8) * rate * 1.5;
        } else {
            return 8 * rate;
        }
    }
}
