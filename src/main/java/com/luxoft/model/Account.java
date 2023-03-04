package com.luxoft.model;

public interface Account {

    double getBalance();
    void deposit(double amount);
    void withdraw(double amount);
    int decimalValue();

}
