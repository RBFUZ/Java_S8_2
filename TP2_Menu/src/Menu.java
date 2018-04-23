import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private static Scanner reader;
    private static int N;

    public Menu()
    {
        reader = new Scanner(System.in);
    }

    public static void main(String[] args) {

        try {
            Menu menu = new Menu();
            int choix;
            ArrayList<String> tableau = new ArrayList<String>();

            tableau.add("Fichier");
            tableau.add("Ouvrir");
            tableau.add("Ouvrir un projet");
            tableau.add("Imprimer");
            tableau.add("Quitter");

            N = tableau.size();

            choix = menu.questionReponse(tableau);

            System.out.println("Vous avez choisis l'option " + tableau.get(choix - 1) + " grâce au numéro " + choix);

        } catch (ExceptionNombreNIncorrect exception) {
            System.out.println(exception.getMessage());
        } catch (ExceptionUtilisateurMauvaisNombre exception) {
            System.out.println(exception.getMessage());
        } catch (ExceptionUtilisateurAucunNombre exception) {
            System.out.println(exception.getMessage());
        }
    }

    public int saisirChoix(int nombreN) throws ExceptionNombreNIncorrect, ExceptionUtilisateurMauvaisNombre, ExceptionUtilisateurAucunNombre {
        int nombre_utilisateur;

        if (nombreN == 1 || nombreN < 1)
            throw new ExceptionNombreNIncorrect("Le nombre N est inférieur ou égal à 1");

        nombre_utilisateur = reader(nombreN);

        if (nombre_utilisateur < 1 || nombre_utilisateur > nombreN)
            throw new ExceptionUtilisateurMauvaisNombre("Le nombre N doit être compris entre 1 et N");

        return nombre_utilisateur;
    }

    public int reader(int nombreN) throws ExceptionUtilisateurAucunNombre
    {
        try {
            System.out.println("Saisir une valeur entre 1 et " + nombreN);
            String chaine = reader.nextLine();

            return Integer.parseInt(chaine);
        } catch (NumberFormatException exception) {
            throw new ExceptionUtilisateurAucunNombre("La valeur n'est pas un nombre");
        }
    }

    public void affichageMenu(ArrayList<String> tableau)
    {
        for (String choix: tableau )
            System.out.println(choix);
    }

    public int questionReponse(ArrayList<String> tableau) throws ExceptionNombreNIncorrect, ExceptionUtilisateurMauvaisNombre, ExceptionUtilisateurAucunNombre {
        affichageMenu(tableau);
        return saisirChoix(N);
    }
}