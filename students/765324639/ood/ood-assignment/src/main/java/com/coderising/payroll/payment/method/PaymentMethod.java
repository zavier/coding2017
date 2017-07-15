package com.coderising.payroll.payment.method;

import com.coderising.payroll.Paycheck;

public interface PaymentMethod {
	public void pay(Paycheck pc);
}
