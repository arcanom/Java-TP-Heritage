package org.example.commercial;

public class Commercial extends Salarie{
   protected  float chiffre;
   protected int commission;
   private final  float POURCENTAGE = 100;


    public Commercial(String nom, int salaire, int commission) {
        super(nom, salaire);
        this.commission = commission;
    }

    public Commercial(String matricule, String categorie, String service, String nom, float salaire, float chiffre, int commission) {
        super(matricule, categorie, service, nom, salaire);
        this.chiffre = chiffre;
        this.commission = commission;
    }

    public float  CalculerSalaire(){
        salaire = salaire + (salaire * (commission / POURCENTAGE) ) ;
        return salaire;
    }
public void  AfficherSalaire(){
        super.AfficherSalaire();
    System.out.println("Le salaire avec commission " + nom +  " est de "+ CalculerSalaire() + " €");
}

}
