public abstract class Employees {

    private String name;
    private int age;
    private String telephone;
    protected double salaire;

    public Employees(String name, int age, String telephone)
    {
        this.name = name;
        this.age = age;
        this.telephone = telephone;
    }

    // Faire un deuxième constructeur

    /**
     * Calcul du salaire de l'employée courant
     */
    public abstract void getSalaire();

    /**
     * Retourne le salaire de l'employée
     * @return le salaire de l'employé
     */
    public double salaire()
    {
        return salaire;
    }
}
