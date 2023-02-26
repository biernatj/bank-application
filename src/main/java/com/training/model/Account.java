package com.training.model;

public interface Account {

    double getBalance();
    public void deposit(double amount);
    public void withdraw(double amount);
    public int decimalValue();

}
