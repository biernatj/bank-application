package com.training.model;

import java.util.List;

public class Client {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    private List<Account> accounts;

    public Client(String name) {
        this.name = name;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    @Override
    public String toString() {
        StringBuilder clientString = new StringBuilder();
        clientString.append("Client{");
        clientString.append("name='");
        clientString.append(name);
        clientString.append('\'');
        clientString.append(", accounts=");
        clientString.append(accounts.toString());
        clientString.append('}');
        return clientString.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        if (name != null ? !name.equals(client.name) : client.name != null) return false;
        return accounts != null ? accounts.equals(client.accounts) : client.accounts == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (accounts != null ? accounts.hashCode() : 0);
        return result;
    }

}
