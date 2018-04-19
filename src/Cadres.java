public class Cadres extends Ouvriers {

    public Cadres(String nom, int age, String telephone)
    {
        super(nom, age, telephone);
        taux_heure_supplementaire = 50;
    }

    public Cadres(String nom, int age, String telephone, int nombre_heure, double taux_horaire) {
        super(nom, age, telephone, nombre_heure, taux_horaire);
        taux_heure_supplementaire = 50;
    }
}
