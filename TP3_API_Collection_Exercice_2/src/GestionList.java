import java.util.ArrayList;

public class GestionList {

    public static ArrayList<Integer> getSingleton(Integer element)
    {
        ArrayList<Integer> ensemble = new ArrayList<>();
        ensemble.add(element);
        return ensemble;
    }

    public static void ajouterElement(ArrayList<Integer> ensemble, Integer element)
    {
        ensemble.add(element);
    }

    public static void afficherEnsemble(ArrayList<Integer> ensemble) {
        System.out.println("--- Affichage des elements de l'ensemble ---");

        for (Integer element : ensemble)
            System.out.println(element);
    }

    public static ArrayList<Integer> unionEnsemble(ArrayList<Integer> ensembleA, ArrayList<Integer> ensembleB)
    {
        ArrayList<Integer> ensembleTotal = new ArrayList<>();

        for (Integer element : ensembleA)
            if (!ensembleTotal.contains((Integer)element))
                ensembleTotal.add(element);

        for (Integer element : ensembleB)
            if (!ensembleTotal.contains((Integer)element))
                ensembleTotal.add(element);

        return ensembleTotal;
    }

    public static ArrayList<Integer> intersectionEnsemble(ArrayList<Integer> ensembleA, ArrayList<Integer> ensembleB)
    {
        ArrayList<Integer> ensembleTotal = new ArrayList<>();

        for (Integer element : ensembleA)
            if (ensembleB.contains((Integer)element))
                ensembleTotal.add(element);

        for (Integer element : ensembleB)
            if (ensembleA.contains((Integer)element))
                if (!ensembleTotal.contains((Integer)element))
                    ensembleTotal.add(element);

        return ensembleTotal;
    }

    public static void contientElement(ArrayList<Integer> ensemble, Integer element)
    {
        if (ensemble.contains(element))
            System.out.println("L'element " + element + " est présent dans l'ensemble");
        else
            System.out.println("L'element " + element + " n'est pas présent dans l'ensemble!");
    }

    public static void sizeEnsemble(ArrayList<Integer> ensemble)
    {
        System.out.println("La taille de l'ensemble est : " + ensemble.size());
    }
}