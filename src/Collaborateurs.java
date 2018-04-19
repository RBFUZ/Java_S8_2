public class Collaborateurs extends Employees implements Salaire_taux_horaire {

    public Collaborateurs(String nom, int age, String telephone)
    {
        super(nom, age, telephone);
    }

    @Override
    public void getSalaire()
    {

    }

    @Override
    public void setInfosSalaire(int nombre_heure, double taux_horaire)
    {
        // Compute
    }
}