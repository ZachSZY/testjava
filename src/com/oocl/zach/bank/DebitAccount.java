package com.oocl.zach.bank;

/**
 * Created by SHAZA on 6/6/2017.
 */
public class DebitAccount extends Account {
    protected DebitAccount(){
        super();
    }

    @Override
    public void withdraw(long amount) {
        boolean insufficientFunds = getBalance() < amount;
        if (insufficientFunds) {
            throw new InsufficientFundsException();
        }
        balance -= amount;
    }
}
