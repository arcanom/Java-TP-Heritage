package org.example.transaction;

import java.util.List;

public class Account implements  AccountInterface {
    int id ;
    List<Transaction> transactions;

   Account compteA;
    Account compteB;

    @Override
    public void sendMoneyToAccount(Account accountTo, double moneyAccount) {


        Transaction transaction = new Transaction(this, accountTo,moneyAccount,StandardAccountOperations.MONEY_TRANSFER_SEND);
        receiveMoney(this, moneyAccount);
        transactions.add(transaction);

    }

    @Override
    public void receiveMoney(Account accountFrom, double moneyAmount) {
        Transaction transaction = new Transaction(accountFrom, this,moneyAmount,StandardAccountOperations.MONEY_TRANSFER_RECEIVE);
        sendMoneyToAccount(accountFrom, moneyAmount);
        transactions.add(transaction);
    }

    @Override
    public void removeMoney(double moneyAmount) {
        Transaction transaction = new Transaction(compteA,compteB ,moneyAmount,StandardAccountOperations.CANCEL_OPERATION);
        transactions.add(transaction);
    }

    @Override
    public  Transaction getTransactions() {
        return (Transaction) transactions;
    }
}
