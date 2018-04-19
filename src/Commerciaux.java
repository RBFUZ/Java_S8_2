public class Commerciaux extends Employees implements Salaire_pourcentage {

    private double chiffre_affaire;

    public Commerciaux() {super();}

    public Commerciaux(String nom, int age, String telephone) {
        super(nom, age, telephone);
    }

    public Commerciaux(String nom, int age, String telephone, double chiffre_affaire) {
        super(nom, age, telephone);
        this.chiffre_affaire = chiffre_affaire;
    }

    @Override
    public double getSalaire() {
        this.salaire = chiffre_affaire * ((double)pourcentage_chiffre_affaire / 100);
        return salaire;
    }

    @Override
    public void setInfosSalaire(double chiffre_affaire) {
        this.chiffre_affaire = chiffre_affaire;
    }
}