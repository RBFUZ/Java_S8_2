public class Programmation {

    public static void main(String[] args) {

        ProgrammeTV programmeTV = new ProgrammeTV();

        programmeTV.ajouter_emission(new JeuxVideo("Emission 1"));
        programmeTV.ajouter_emission(new DocumentaireAnimaliers("Emission 2", "Un theme", 5));
        programmeTV.ajouter_emission(new JeuxVideo("Emission 3"));
        programmeTV.ajouter_emission(new DocumentairesCulturels("Emission 4", "Un theme", 3));
        programmeTV.ajouter_emission(new Films("Mon film", 2010, "Nom_real", true, 4));
        programmeTV.ajouter_emission(new Films("Mon deuxième film", 2010, "Nom_real", false, 2));
        programmeTV.ajouter_emission(new DocumentairesCulturels("Emission 5", "Un theme", 7));
        programmeTV.ajouter_emission(new JeuxVideo("Emission 6"));
        programmeTV.ajouter_emission(new JeuxVideo("Emission 7"));
        programmeTV.ajouter_emission(new JeuxVideo("Emission 8"));
        programmeTV.ajouter_emission(new Films("Mon troisième film", 2010, "Nom_real", false, 1));

        programmeTV.afficher_toutes_les_emissions();
        programmeTV.afficher_heure_par_heure();
        programmeTV.test_superposition();
    }
}
