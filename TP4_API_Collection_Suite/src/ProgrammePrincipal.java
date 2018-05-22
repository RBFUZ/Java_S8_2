import java.util.Scanner;
import java.util.LinkedList;

public class ProgrammePrincipal {

    public static void main(String [ ] args) {

        // Créer une liste vide
        MyList myList = new MyList();
        int result = 0;
        String element;
        Scanner sc = new Scanner(System.in);

        System.out.println("====================================\n Opérations dur les listes chainées \n ================================== ");

        while (result < 22) {
            try {
                afficherMenu();
                result = Integer.parseInt(sc.nextLine());

                switch (result) {
                    case 0:
                        myList = new MyList();
                        break;
                    case 1:
                        System.out.println("Element à ajouter : ");
                        myList.ajouterElement(sc.nextLine());
                        break;
                    case 2:
                        myList.afficher();
                        break;
                    case 3:
                        System.out.println("A partir de quelle position ? : ");
                        myList.afficher(Integer.parseInt(sc.nextLine()));
                        break;
                    case 4:
                        myList.afficherInverse();
                        break;
                    case 5:
                        System.out.println("Quel element ? : ");
                        element = sc.nextLine();
                        System.out.println("Quelle position ? : ");
                        myList.ajouterElementPosition(Integer.parseInt(sc.nextLine()), element);
                        break;
                    case 6:
                        System.out.println("Quel element ? : ");
                        myList.ajouterElementDebut(sc.nextLine());
                        break;
                    case 7:
                        System.out.println("Quel element ? : ");
                        myList.ajouterElementFin(sc.nextLine());
                        break;
                    case 8:
                        myList.afficherAvecIndice();
                        break;
                    case 9:
                        System.out.println("Quel element ? : ");
                        myList.estPresent(sc.nextLine());
                        break;
                    case 10:
                        System.out.println("Quel element ? : ");
                        myList.supprimerElement(sc.nextLine());
                        break;
                    case 11:
                        myList.supprimerElementDebut();
                        break;
                    case 12:
                        System.out.println("Quel element numero 1 ? : ");
                        element = sc.nextLine();
                        System.out.println("Quel element numero 2 ? : ");
                        myList.echangerDeuxElement(element, sc.nextLine());
                        break;
                    case 13:
                        myList.melanger();
                        break;
                    case 14:
                        myList.dupliquer();
                        break;
                    case 15:
                        myList.supprimerElementDebut();
                        break;
                    case 16:
                        System.out.println("Le premier element est " + myList.recupererElementDebut());
                        break;
                    case 17:
                        System.out.println("Le dernier element est " + myList.recupererElementFin());
                        break;
                    case 18:
                        System.out.println("Quel element à ajouter ? : ");
                        element = sc.nextLine();
                        System.out.println("Quel index ? : ");
                        myList.remplacer(Integer.parseInt(sc.nextLine()), element);
                        break;
                    case 19:
                        myList.convertirArrayList();
                        break;
                    case 20:
                        myList.estVide();
                        break;
                    default:
                        afficherMenu();
                        break;
                }
            } catch (NumberFormatException e)
            {
                System.out.println("La saisie est incorrecte, recommencez !");
            }
        }
    }

    private static void afficherMenu()
    {
        System.out.println("0 - Créer une liste");
        System.out.println("1 - Ajouter des éléments à la liste");
        System.out.println("2 - Afficher les éléments d’une liste");
        System.out.println("3 - Afficher les éléments de la liste à partir d’une position donnée");
        System.out.println("4 - Afficher les éléments de la liste dans le sens inverse ");
        System.out.println("5 - Rajouter un élément donné à une position spécifique de la liste");
        System.out.println("6 - Insérer un élément en tête de liste");
        System.out.println("7 - Insérer un élément en queue de liste");
        System.out.println("8 - Afficher tous les éléments avec leurs indices dans la liste");
        System.out.println("9 - Vérifier si un élément appartient à la liste");
        System.out.println("10 - Supprimer un élément donné de la liste");
        System.out.println("11 - Supprimer le premier élément de la liste");
        System.out.println("12 - Permuter deux éléments de la liste");
        System.out.println("13 - Mélanger les éléments de la liste");
        System.out.println("14 - Dupliquer la liste dans une nouvelle liste");
        System.out.println("15 - Supprimer le premier élément de la liste");
        System.out.println("16 - Récupérer (sans supprimer) le premier élément");
        System.out.println("17 - Récupérer (sans supprimer) le dernier élément");
        System.out.println("18 - Remplacer un élément d’indice i.");
        System.out.println("19 - Convertir la liste en ArrayList");
        System.out.println("20 - Vérifier si une liste est vide");
        System.out.println("21 - Comparer la liste avec une liste donnée");
        System.out.println("22 - Quitter le programme");
    }
}
