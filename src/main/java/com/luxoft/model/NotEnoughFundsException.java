package com.luxoft.model;

public class NotEnoughFundsException extends BankException {

    int id;
    double balance;
    double amount;

}
