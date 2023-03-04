package com.luxoft.model;

import java.util.List;
import java.util.Objects;

public class Client {
    private String name;
    private String birthday;

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
        clientString.append("Client{")
                    .append("name='")
                    .append(name)
                    .append('\'')
                    .append(", accounts=")
                    .append(accounts.toString())
                    .append('}');
        return clientString.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        return Objects.equals(name, client.name);

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (accounts != null ? accounts.hashCode() : 0);
        return result;
    }

}
