import java.util.ArrayList;

public class Paie {

    public static void main(String[] args) {

        ArrayList<Employees> tableau_employees = new ArrayList<Employees>();

        Employees ouvriers_1 = new Ouvriers("Jean", 14, "00000", 29, 9.6);
        Employees ouvriers_2 = new Ouvriers("Remy", 14, "00000", 37, 11.1);
        Employees ouvriers_3 = new Ouvriers("Pierre", 14, "00000", 34, 7.9);

        Employees cadres_1 = new Cadres("Jean", 14, "00000", 20, 9.9);
        Employees cadres_2 = new Cadres("Jacky", 14, "00000", 40, 9.3);

        Employees commerciaux_1 = new Commerciaux("Xavier", 14, "00000", 900);
        Employees commerciaux_2 = new Commerciaux("Raphael", 14, "00000", 470);

        Employees collaborateurs_1 = new Collaborateurs("Pierrick", 14, "00000", 27, 9.6);
        ((Collaborateurs) collaborateurs_1).setInfosSalaire(500);
        Employees collaborateurs_2 = new Collaborateurs("Liddy", 14, "00000", 33, 9.6);
        ((Collaborateurs) collaborateurs_2).setInfosSalaire(900);

        tableau_employees.add(ouvriers_1);
        tableau_employees.add(ouvriers_2);
        tableau_employees.add(ouvriers_3);
        tableau_employees.add(cadres_1);
        tableau_employees.add(cadres_2);
        tableau_employees.add(commerciaux_1);
        tableau_employees.add(commerciaux_2);
        tableau_employees.add(collaborateurs_1);
        tableau_employees.add(collaborateurs_2);

        for (Employees e: tableau_employees) {
            e.getSalaire();
            System.out.println(e.getName() + " gagne " + e.salaire);
        }
    }
}