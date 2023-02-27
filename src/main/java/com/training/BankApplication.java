package com.training;

import com.training.service.BankService;

public class BankApplication {
    public static void main(String[] args) {

        BankService bankService = new BankService();

        if(args.length == 0 || !"-loadfeed".equals(args[0])) {
            System.out.println("Usage:");
            System.out.println("BankApplication -loadfeed <filename>");
        }
        String fileName = args[1];
        if("-loadfeed".equals(args[0])) {
            bankService.loadFeed(fileName);
            System.out.println("Feed loaded");
        }
    }

}