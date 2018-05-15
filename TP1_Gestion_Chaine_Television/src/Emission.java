public abstract class Emission {

    protected String nom;
    protected int duree;
    protected int heure_debut;
    protected int heure_fin;

    public Emission() {}

    protected abstract boolean RestrictionHoraireProgrammation(int heure_debut, int heure_fin);
}
