package org.example.transaction;

import org.example.agence.Compte;

public class Transaction {

    Account compteDe;
    Account compteA;

    double argentMontant;
    StandardAccountOperations operation;

    public Transaction(Account compteDe, Account compteA, double argentMontant, StandardAccountOperations operation) {
        this.compteDe = compteDe;
        this.compteA = compteA;
        this.argentMontant = argentMontant;
        this.operation = operation;
    }
}
