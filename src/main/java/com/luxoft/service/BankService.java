package com.luxoft.service;

import com.luxoft.model.Bank;
import com.luxoft.model.Client;
import com.luxoft.model.ClientExistsException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BankService {

    private final static Bank bank = new Bank();

    public void loadFeed(String fileName) {

        try(BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            for(String line; (line = br.readLine()) != null; ) {
                System.out.println(line);
                bank.addClient(readClientFromLineFeed(fileName));
            }
        } catch(FileNotFoundException e) {
            System.out.println(e);
        } catch(IOException e) {
            System.out.println(e);
        } catch (ClientExistsException e) {
            throw new RuntimeException(e);
        }
    }

    private Client readClientFromLineFeed(String line) {
        //Client client = new Client();
        String[] splitted = line.split(";");
        String accounttype = splitted[0].split("=")[2];
        return null;
    }

    public void readBank() {
    }

    public void saveBank() {
    }

}
