package org.example.agence;

public class Payant extends Compte{
    private final float TAUX =5;

    private final float POURCENTAGE = 100;

    public Payant(float solde) {
        super(solde);
    }
@Override
    public void verser(float mnt){

        super.verser(mnt);
        super.retirer(mnt*(TAUX/POURCENTAGE));
    }

    public void retirer(float mnt){
        super.retirer(mnt);
        super.retirer(mnt*(TAUX/POURCENTAGE));
    }

    @Override
    public String toString() {
        return "Payant{" +
                "solde=" + solde +
                '}' + super.toString();
    }

    @Override
    public void creationInfo() {
        System.out.println("Je viens d'etre crée et je suis un compte Payant");
    }
}
