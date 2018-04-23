public class Divertissement extends Emission implements RestrictionHoraireProgrammation {

    protected final int duree_heure = 120; // Maximum, deux heures;

    public Divertissement() {super();}

    public Divertissement(String nom)
    {
        this.nom = nom;
    }

    public void restrictionHoraire(int heure_duree, int heure_fin)
    {
        // Condition qui check si la programmation se situe entre ces deux plages d'horaires
    }
}