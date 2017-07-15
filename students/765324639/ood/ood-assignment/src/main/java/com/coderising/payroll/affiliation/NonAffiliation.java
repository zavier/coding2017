package com.coderising.payroll.affiliation;

import com.coderising.payroll.Paycheck;

public class NonAffiliation implements Affiliation {

    @Override
    public double calculateDeductions(Paycheck pc) {
        return 0;
    }
}
