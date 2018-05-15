public class Divertissement extends Emission {

    final static int DUREE_HEURE_MAX = 2; // Maximum, deux heures;
    final static int RESTRICTION_HEURE_DEBUT = 18;
    final static int RESTRICTION_HEURE_FIN = 23;

    @Override
    public boolean RestrictionHoraireProgrammation(int heure_debut, int heure_fin)
    {
        if (heure_debut < RESTRICTION_HEURE_DEBUT || heure_debut >= RESTRICTION_HEURE_FIN)
            return false;
        else if (heure_fin > RESTRICTION_HEURE_FIN)
            return false;
        else
            return true;
    }
}