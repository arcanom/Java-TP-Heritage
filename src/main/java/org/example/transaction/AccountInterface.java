package org.example.transaction;

public interface AccountInterface {
    void sendMoneyToAccount(Account accountTo, double moneyAccount);

    void receiveMoney(Account accountFrom, double moneyAmount);

    void removeMoney(double moneyAmount);

    Transaction getTransactions();
}
