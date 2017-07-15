package com.coderising.payroll.affiliation;

import com.coderising.payroll.Paycheck;

public class UnionAffiliation implements Affiliation{

    @Override
    public double calculateDeductions(Paycheck pc) {
        return 0;
    }
}
