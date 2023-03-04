package com.luxoft.report;

import com.luxoft.model.Account;
import com.luxoft.model.Bank;
import com.luxoft.model.Client;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;

public class BankReport {

    public static int getNumberOfClients(Bank bank) {
        return 0;
    }

    public static int getNumberOfAccounts(Bank bank) {
        return 0;
    }

    public static SortedSet getClientsSorted(Bank bank) {
        return null;
    }

    public static double getTotalSumInAccounts(Bank bank) {
        return 0;
    }

    public static SortedSet getAccountsSortedBySum(Bank bank) {
        return null;
    }

    public static double getBankCreditSum(Bank bank) {
        return 0;
    }

    public static Map<Client, Collection<Account>> getCustomerAccounts(Bank bank) {
        return null;
    }

    Map<String, List<Client>> getClientsByCity(Bank bank) {
        return null;
    }

}
