public class Reportage extends Emission {

    protected String theme;
    protected int duree_heure;

    public Reportage() {super();}

    public Reportage(String nom, String theme, int duree_heure)
    {
        this.nom = nom;
        this.theme = theme;
        this.duree_heure = duree_heure;
    }
}
