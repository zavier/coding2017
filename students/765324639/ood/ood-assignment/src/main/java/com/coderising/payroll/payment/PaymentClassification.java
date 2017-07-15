package com.coderising.payroll.payment;

import com.coderising.payroll.Paycheck;

public interface PaymentClassification {
	public double calculatePay(Paycheck pc);
}
