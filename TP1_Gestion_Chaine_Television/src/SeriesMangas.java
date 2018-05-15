public class SeriesMangas extends Divertissement {

    private Fiction fiction;

    public SeriesMangas(String nom)
    {
        this.nom = nom;
        this.duree = DUREE_HEURE_MAX;
    }

    public SeriesMangas(String nom, int annee_realisation, String nom_realisateur, boolean redifusion, int duree)
    {
        this.fiction = new Fiction(nom, annee_realisation, nom_realisateur, redifusion, duree);
    }
}
