import java.util.ArrayList;

public class ProgrammeTV {

    public static final int DUREE_MAX_JOURNEE = 24;
    private ArrayList<Emission> emissions;

    public ProgrammeTV() {
        emissions = new ArrayList<>();
    }

    public void ajouter_emission(Emission emission) {
        int duree_debut = 0;
        int duree_fin = duree_debut + emission.duree;

        if (emissions.size() != 0) {
            duree_debut = emissions.get(emissions.size() - 1).heure_fin;
            duree_fin = duree_debut + emission.duree;
        }

        if (duree_fin <= DUREE_MAX_JOURNEE) {
            if (emission.RestrictionHoraireProgrammation(duree_debut, duree_fin)) {
                emission.heure_debut = duree_debut;
                emission.heure_fin = duree_fin;
                emissions.add(emission);
            }
        }
    }

    public void afficher_toutes_les_emissions() {
        System.out.println("---- AFFICHAGE DE TOUTES LES EMISSIONS ----");
        for (Emission emission : emissions) {
            System.out.println(emission.nom);
        }
    }

    public boolean test_superposition() {
        System.out.println("---- TEST SI SUPERPOSITION ----");
        int indice_1 = 0, indice_2 = 0;

        for (Emission emission_1 : emissions) {
            for (Emission emission_2 : emissions) {
                if (indice_1 == indice_2)
                    continue;

                if (emission_1.heure_debut >= emission_2.heure_debut && emission_1.heure_debut < emission_2.heure_fin)
                {
                    System.out.println("Superposition détectée");
                    return true;
                }
                else if (emission_1.heure_fin >= emission_2.heure_debut && emission_1.heure_fin < emission_2.heure_fin)
                {
                    System.out.println("Superposition détectée");
                    return true;
                }
                indice_2++;
            }
            indice_1++;
        }
        System.out.println("Aucune superposition");
        return false;
    }

    public void afficher_heure_par_heure() {
        System.out.println("---- AFFICHAGE HEURE PAR HEURE ----");
        for (int heure = 0; heure < DUREE_MAX_JOURNEE; heure++) {
            System.out.print("Heure " + heure + " : ");

            for (Emission emission : emissions) {
                if (heure >= emission.heure_debut && heure < emission.heure_fin) {
                    System.out.print(emission.nom);
                }
            }
            System.out.println();
        }
    }
}