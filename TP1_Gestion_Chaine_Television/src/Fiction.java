public class Fiction extends Emission implements RestrictionHoraireProgrammation {

    protected int annee_realisation;
    protected String nom_realisateur;
    protected boolean redifusion;

    public Fiction() {super();}

    public Fiction(String nom, int annee_realisation, String nom_realisateur, boolean redifusion)
    {
        this.nom = nom;
        this.annee_realisation = annee_realisation;
        this.nom_realisateur = nom_realisateur;
        this.redifusion = redifusion;
    }

    public void restrictionHoraire(int heure_duree, int heure_fin)
    {
        // Condition qui check si la programmation se situe entre ces deux plages d'horaires
    }
}
