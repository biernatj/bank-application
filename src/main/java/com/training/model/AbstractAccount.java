package com.training.model;

public abstract class AbstractAccount implements Account {

    int id;
    double balance;

    @Override
    public void deposit(double amount) {
        balance += amount;
    }
    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }
    public double getBalance() {
        return balance;
    }
    public int decimalValue() {
        return (int) Math.round(balance);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AbstractAccount that = (AbstractAccount) o;

        if (id != that.id) return false;
        return Double.compare(that.balance, balance) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        temp = Double.doubleToLongBits(balance);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        StringBuilder accountString = new StringBuilder();
        accountString.append("AbstractAccount{");
        accountString.append("id=");
        accountString.append(id);
        accountString.append(", balance=");
        accountString.append(balance);
        accountString.append('}');
        return accountString.toString();
    }

}
