package com.training.model;

public class CheckingAccount extends AbstractAccount {

    double overdraft;

    @Override
    public void withdraw(double amount) {
        overdraft -= amount;
    }

    public double getOverdraft() {
        return overdraft;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CheckingAccount that = (CheckingAccount) o;
        return Double.compare(that.overdraft, overdraft) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(overdraft);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        StringBuilder checkingAccountString = new StringBuilder();
        checkingAccountString.append("CheckingAccount{");
        checkingAccountString.append(super.toString());
        checkingAccountString.append("overdraft=");
        checkingAccountString.append(overdraft);
        checkingAccountString.append(", id=");
        checkingAccountString.append(id);
        checkingAccountString.append(", balance=");
        checkingAccountString.append(balance);
        checkingAccountString.append(super.toString());
        checkingAccountString.append('}');
        return checkingAccountString.toString();
    }
}
