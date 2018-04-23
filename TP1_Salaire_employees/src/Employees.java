public abstract class Employees {

    private String name;
    private int age;
    private String telephone;
    protected double salaire = 0;

    public Employees() {}

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
    public abstract double getSalaire();

    /**
     * Retourne le salaire de l'employée
     * @return le salaire de l'employé
     */
    public double salaire()
    {
        return salaire;
    }

    public String getName() {
        return name;
    }

    public int getAge() { return age; }

    public void setAge(int age) { this.age = age; }

    public String getTelephone() { return telephone; }

    public void setTelephone(String telephone) { this.telephone = telephone; }

    public void setSalaire(double salaire) { this.salaire = salaire; }
}