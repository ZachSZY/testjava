package com.oocl.zach.bank;

import org.junit.Test;

import java.net.ConnectException;

import static org.junit.Assert.*;

/**
 * Created by SHAZA on 6/6/2017.
 */
public class AccountTest implements IAssessmentService {

    @Test
    public void open_account() {
        Account account = Account.openAccount();
        long balance = account.getBalance();
        assertEquals(0, balance);
    }

    @Test
    public void deposit_to_account() {
        Account account = Account.openAccount();
        account.deposit(100L);
        long balance = account.getBalance();
        assertEquals(100L, balance);
    }

    @Test
    public void withdraw_from_account() {
        Account account = Account.openAccount();
        account.deposit(100L);
        account.withdraw(80L);
        long balance = account.getBalance();
        assertEquals(20L, balance);
    }

    @Test
    public void withdraw_from_account_with_insuffient_count() {
        Account account = Account.openAccount();
        account.deposit(100L);
        try {
            account.withdraw(200L);
        } catch (InsufficientFundsException e) {
        }
    }

    @Test
    public void open_debit_account() {
        Account account = new DebitAccount();
        long balance = account.getBalance();
        assertEquals(0, balance);
    }

    @Test
    public void open_credit_account() {
        Account account = new CreditAccount();
        long balance = account.getBalance();
        assertEquals(0, balance);
    }

    @Test
    public void withdraw_from_creditAccount() {
        Account account = new CreditAccount(this);
        account.deposit(100L);
        account.withdraw(80L);
        long balance = account.getBalance();
        assertEquals(20L, balance);
    }

    @Override
    public long getCredit(String socialSecurityNumber) throws ConnectException {
        return 1000L;
    }

    @Test
    public void withdraw_from_creditAccount_with_credit() {
        Account account = new CreditAccount(this);
        account.deposit(100L);
        account.withdraw(200L);
        long balance = account.getBalance();
        assertEquals(0, balance);
    }

    @Test
    public void withdraw_from_creditAccount_with_insuffient_count() {
        Account account = new CreditAccount(this);
        account.deposit(100L);
        try {
            account.withdraw(1200L);
        } catch (InsufficientFundsException e) {
        }
    }
}