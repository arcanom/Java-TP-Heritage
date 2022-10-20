package org.example.agence;

public  abstract class Compte implements  Creation {
    private int code;
    protected float solde;

    private static int nbComptes =1;


    public Compte(float solde){
        this.code = ++nbComptes;
        this.solde = solde;
    }

    public Compte(){

    }

    public static int getNbComptes() {
        return nbComptes;
    }

    public static void setNbComptes(int nbComptes) {
        Compte.nbComptes = nbComptes;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public float getSolde() {
        return solde;
    }

    public void setSolde(float solde) {
        this.solde = solde;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "code=" + code +
                ", solde=" + solde +
                '}';
    }

    public void retirer(float mnt){
        if(this.solde > mnt){

            this.solde -= mnt;
        }



    }

    public void verser(float mnt){
        this.solde +=  mnt;
    }
}
