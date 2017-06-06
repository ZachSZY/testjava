package com.oocl.zach.bank;

public class Account {

    private boolean isDebit;
    private boolean isCredit;
    protected long balance;

    public Account() {

    }

    protected Account(boolean isDebit) {
        this.isDebit = isDebit;
    }

    public static Account openDebitAccount() {
        return new DebitAccount();
    }

    public static Account openAccount() {
        return new Account(false);
    }

    public long getBalance() {
        return balance;
    }

    public void deposit(long amount) {
        balance += amount;
    }

    public void withdraw(long amount) {
        boolean insufficientFunds = getBalance() < amount;
        if (insufficientFunds) {
            throw new InsufficientFundsException();
        }
        balance -= amount;
    }
}
