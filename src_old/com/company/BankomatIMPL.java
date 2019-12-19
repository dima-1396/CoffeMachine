package com.company;

public interface BankomatIMPL {
    boolean checkPin(String cartID, String pin);

    float getBalance();

    void getCash(float cash);

    void addCash(float cash);

    void reject();
}