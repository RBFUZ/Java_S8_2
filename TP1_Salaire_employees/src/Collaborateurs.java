public class Collaborateurs extends Cadres {

    private Commerciaux commerciaux;

    public Collaborateurs(String nom, int age, String telephone)
    {
        super(nom, age, telephone);
        commerciaux = new Commerciaux(nom, age, telephone);
    }

    public Collaborateurs(String nom, int age, String telephone, int nombre_heure, double taux_horaire)
    {
        super(nom, age, telephone, nombre_heure, taux_horaire);
        commerciaux = new Commerciaux(nom, age, telephone);
    }

    @Override
    public double getSalaire() {
        super.getSalaire();
        this.salaire += commerciaux.getSalaire();
        return salaire;
    }

    public void setInfosSalaire(double chiffre_affaire)
    {
        commerciaux.setInfosSalaire(chiffre_affaire);
    }
}