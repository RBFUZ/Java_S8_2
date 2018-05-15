import java.util.ArrayList;
import java.util.Scanner;

public class ProgrammePrincipal {

    public static void main(String[] args) {

        ArrayList<Double> notes = new ArrayList<Double>();
        ArrayList<Double> coefficients = new ArrayList<Double>();
        Scanner sc = new Scanner(System.in);
        String saisie = "0";
        int position;

        while (!saisie.equals("5"))
        {
            afficher_menu();
            saisie = sc.nextLine();

            try {
                switch (saisie) {

                    case "1":
                        afficher_ajout_note();
                        GestionNotes.ajouter_note(notes, Double.parseDouble(saisie = sc.nextLine()));
                        System.out.println("Coefficient : ");
                        GestionNotes.ajouter_coefficient(coefficients, Double.parseDouble(saisie = sc.nextLine()));
                        break;
                    case "2":
                        GestionNotes.afficher_toutes_les_notes(notes);
                        GestionNotes.afficher_tous_les_coefficients(coefficients);
                        break;
                    case "3":
                        afficher_moyenne();
                        System.out.println(GestionNotes.moyenne(notes, coefficients));
                        break;
                    case "4":
                        afficher_modifier_note();
                        GestionNotes.afficher_toutes_les_notes(notes);
                        System.out.println("Quelle position (de 0 à size - 1)? : ");
                        position = Integer.parseInt(sc.nextLine());
                        System.out.println("Quelle note ? : ");
                        GestionNotes.changer_note(notes, Integer.parseInt(sc.nextLine()), position);
                        GestionNotes.afficher_toutes_les_notes(notes);
                        break;
                    case "5":
                        System.out.println("Programme terminé");
                        break;
                    default:
                        throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("La saisie n'est pas correcte");
            }
        }
    }

    public static void afficher_menu()
    {
        System.out.println("\n--- MENU ---");

        System.out.println("Saisir 1 - Ajouter un nouvelle note");
        System.out.println("Saisir 2 - Afficher toutes les notes et tout les coefficients");
        System.out.println("Saisir 3 - Calculer et afficher la moyenne des notes");
        System.out.println("Saisir 4 - Modifier une note");
        System.out.println("Saisir 5 - Pour quitter le programme \n\n");
    }

    public static void afficher_ajout_note()
    {
        System.out.println("\n--- AJOUT DE NOTE ---");
        System.out.print("Note : ");
    }

    public static void afficher_moyenne()
    {
        System.out.println("\n--- AFFICHAGE DE LA MOYENNE ---");
        System.out.print("Moyenne : ");
    }

    public static void afficher_modifier_note()
    {
        System.out.println("\n--- MODIFIER UNE NOTE ---");
    }
}