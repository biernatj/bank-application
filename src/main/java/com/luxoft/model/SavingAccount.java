package com.luxoft.model;

public class SavingAccount extends AbstractAccount {

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        StringBuilder savingAccountString = new StringBuilder();
        savingAccountString.append("SavingAccount{")
                           .append(super.toString())
                           .append("}");
        return savingAccountString.toString();
    }

}
