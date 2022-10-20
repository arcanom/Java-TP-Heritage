package org.example.agence;

public class Simple extends Compte {
    private int decouvert;


    public Simple(float solde, int decouvert) {
        super(solde);
        this.decouvert = decouvert;
    }

    public void retirer(float mnt){
        if(this.solde + this.decouvert > mnt){

        }
    }

    @Override
    public String toString() {
        return "Simple{" +
                "solde=" + solde +
                '}';
    }

    @Override
    public void creationInfo() {
        System.out.println("Je viens d'etre crée et je suis un compte Simple");
    }
}

