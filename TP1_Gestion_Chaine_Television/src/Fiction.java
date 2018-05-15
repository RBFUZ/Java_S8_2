public class Fiction extends Emission {

    protected int annee_realisation;
    protected String nom_realisateur;
    protected boolean redifusion;
    private final static int RESTRICTION_HORAIRE_DEBUT = 21;

    public Fiction(String nom, int annee_realisation, String nom_realisateur, boolean redifusion, int duree)
    {
        this.nom = nom;
        this.annee_realisation = annee_realisation;
        this.nom_realisateur = nom_realisateur;
        this.redifusion = redifusion;
        this.duree = duree;
    }

    @Override
    public boolean RestrictionHoraireProgrammation(int heure_debut, int heure_fin)
    {
        if (redifusion)
            return true;
        else
            if (heure_debut < RESTRICTION_HORAIRE_DEBUT)
                return false;
            else
                return true;
    }
}