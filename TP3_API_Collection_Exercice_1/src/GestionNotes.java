import java.util.ArrayList;

public class GestionNotes {

    public static void ajouter_note(ArrayList<Double> notes, double note)
    {
        notes.add(note);
    }

    public static void ajouter_coefficient(ArrayList<Double> coefficients, double coefficient)
    {
        coefficients.add(coefficient);
    }

    public static void afficher_toutes_les_notes(ArrayList<Double> notes)
    {
        System.out.println("--- Affichage des notes ---");

        for (double note: notes) {
            System.out.println(note);
        }
    }

    public static void afficher_tous_les_coefficients(ArrayList<Double> coefficients)
    {
        System.out.println("--- Affichage des coefficients ---");

        for (double coefficient: coefficients) {
            System.out.println(coefficient);
        }
    }

    public static double moyenne(ArrayList<Double> notes, ArrayList<Double> coefficients)
    {
        double total = 0.0, somme_coefficients = 0.0;
        int indice = 0;

        for (double note: notes) {
            total += note * coefficients.get(indice);
            somme_coefficients += coefficients.get(indice);
            indice++;
        }

        return total / somme_coefficients;
    }

    public static void changer_note(ArrayList<Double> notes, double note, int position)
    {
        notes.set(position, note);
    }
}