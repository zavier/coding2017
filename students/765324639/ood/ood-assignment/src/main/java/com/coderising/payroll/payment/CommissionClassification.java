package com.coderising.payroll.payment;

import com.coderising.payroll.Paycheck;
import com.coderising.payroll.utils.DateUtil;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class CommissionClassification implements PaymentClassification {
    private double salary;
    private double rate;
    private Map<Date, SalesReceipt> receipts;

    @Override
    public double calculatePay(Paycheck pc) {
        double commission = 0.0;
        for (SalesReceipt sr : receipts.values()) {
            if (DateUtil.between(sr.getSaleDate(), pc.getPayPeriodStartDate(), pc.getPayPeriodEndDate())) {
                commission += sr.getAmount() * rate;
            }
        }
        return salary + commission;
    }
}
