package com.training.model;

public class CheckingAccount extends AbstractAccount {

    double overdraft;

    @Override
    public double getBalance() {
        return 0;
    }

    @Override
    public void deposit(double amount) {

    }

    @Override
    public void withdraw(double amount) {

    }

    @Override
    public int decimalValue() {
        return 0;
    }

    public double getOverdraft() {
        return 0;
    }

}
