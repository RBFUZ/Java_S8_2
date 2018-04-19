public class Ouvriers extends Employees implements Salaire_taux_horaire {

    protected double nombre_heure;
    protected double taux_horaire;
    protected int taux_heure_supplementaire = 30;

    public Ouvriers(String name, int age, String telephone)
    {
        super(name, age, telephone);
    }

    public Ouvriers(String nom, int age, String telephone, int nombre_heure, double taux_horaire)
    {
        super(nom, age, telephone);
        this.nombre_heure = nombre_heure;
        this.taux_horaire = taux_horaire;
    }

    @Override
    public void getSalaire()
    {
        double salaire;

        if (nombre_heure > 35)
            salaire = nombre_heure_max * taux_horaire;
        else
            salaire = nombre_heure * taux_horaire;

        salaire += (nombre_heure - nombre_heure_max) * (taux_horaire * (((double)taux_heure_supplementaire / 100) + 1));

        this.salaire = salaire;
    }

    public void setInfosSalaire(int nombre_heure, double taux_horaire)
    {
        this.nombre_heure = nombre_heure;
        this.taux_horaire = taux_horaire;
    }
}