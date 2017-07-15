package com.coderising.payroll.payment;

import com.coderising.payroll.Paycheck;
import com.coderising.payroll.payment.PaymentClassification;

public class SalariedClassification implements PaymentClassification {
    private double salary;

    @Override
    public double calculatePay(Paycheck pc) {
        return salary;
    }
}
