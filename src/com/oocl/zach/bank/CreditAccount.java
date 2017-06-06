package com.oocl.zach.bank;

import java.net.ConnectException;

/**
 * Created by SHAZA on 6/6/2017.
 */
public class CreditAccount extends Account {
    private static IAssessmentService service = new IAssessmentService.AssessmentService();
    public long credit;

    protected CreditAccount() {
    }

    protected CreditAccount(IAssessmentService service) {
        this.service = service;
    }

    @Override
    public void withdraw(long amount) {

        try {
            credit = service.getCredit("1000");
        } catch (ConnectException e) {
            e.printStackTrace();
        }
        boolean insufficientFunds = getBalance() + credit < amount;
        if (insufficientFunds) {
            throw new InsufficientFundsException();
        }else if(getBalance()>=amount){
            balance -= amount;
        }else{
            balance=0;
            credit-=(amount-balance);
        }

    }
}
