import java.util.ArrayList;

public class ProgrammePrincipal {

    public static void main(String[] args){
        ArrayList<Integer> ensembleA = GestionList.getSingleton(0);
        ArrayList<Integer> ensembleB = GestionList.getSingleton(0);
        ArrayList<Integer> ensembleUnion;
        ArrayList<Integer> ensembleIntersection;

        GestionList.ajouterElement(ensembleA, 5);
        GestionList.ajouterElement(ensembleA, 7);
        GestionList.ajouterElement(ensembleA, 8);
        GestionList.ajouterElement(ensembleA, 9);
        GestionList.ajouterElement(ensembleA, 10);

        GestionList.ajouterElement(ensembleB, 1);
        GestionList.ajouterElement(ensembleB, 2);
        GestionList.ajouterElement(ensembleB, 8);
        GestionList.ajouterElement(ensembleB, 9);
        GestionList.ajouterElement(ensembleB, 11);

        GestionList.afficherEnsemble(ensembleA);
        GestionList.afficherEnsemble(ensembleB);

        ensembleUnion = GestionList.unionEnsemble(ensembleA, ensembleB);
        GestionList.afficherEnsemble(ensembleUnion);

        ensembleIntersection = GestionList.intersectionEnsemble(ensembleA, ensembleB);
        GestionList.afficherEnsemble(ensembleIntersection);

        GestionList.contientElement(ensembleA, 10);
        GestionList.contientElement(ensembleA, 25);

        GestionList.sizeEnsemble(ensembleA);
        GestionList.sizeEnsemble(ensembleB);
        GestionList.sizeEnsemble(ensembleUnion);
        GestionList.sizeEnsemble(ensembleIntersection);
    }
}