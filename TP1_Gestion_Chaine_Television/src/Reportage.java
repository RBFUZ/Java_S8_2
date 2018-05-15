public class Reportage extends Emission {

    protected String theme;

    public Reportage(String nom, String theme, int duree)
    {
        this.nom = nom;
        this.theme = theme;
        this.duree = duree;
    }

    @Override
    public boolean RestrictionHoraireProgrammation(int heure_debut, int heure_fin)
    {
        // Aucune restriction
        return true;
    }
}
