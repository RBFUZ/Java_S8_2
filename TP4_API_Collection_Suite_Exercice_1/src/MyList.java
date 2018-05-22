import java.util.Collections;
import java.util.ArrayList;
import java.util.LinkedList;

public class MyList {

    private LinkedList<String> l_list;

    public LinkedList<String> getL_list() { return l_list; }

    public MyList() {
        l_list = new LinkedList<String>();
    }

    public void ajouterElement(String contenu)
    {
        l_list.add(contenu);
    }

    public void ajouterElementPosition(int index, String contenu)
    {
        l_list.add(index, contenu);
    }

    public void ajouterElementDebut(String contenu)
    {
        l_list.addFirst(contenu);
    }

    public void ajouterElementFin(String contenu)
    {
        l_list.addLast(contenu);
    }

    public void afficher()
    {
        System.out.println("--- Affichage des éléments ---");

        for(String s : l_list)
            System.out.println(s);

        System.out.println("--- Fin de l'affichage ---");
    }

    public void afficherAvecIndice()
    {
        System.out.println("--- Affichage des éléments avec les indices ---");

        int index = 0;
        for(String s : l_list)
            System.out.println("Indice : " + (index++) + " Element : " + s);

        System.out.println("--- Fin de l'affichage ---");
    }

    public void afficher(int index)
    {
        System.out.println("--- Affichage des éléments à partir de la position " + index + " ---");

        try {
            l_list.get(index); // Test si l'index donné n'est pas supérieur à la taille de la liste chainée.

            for(int i = index; i < l_list.size(); i++)
                System.out.println(l_list.get(i));

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Erreur : l'index donné est supérieur à la taille de la liste chainée");
        }

        System.out.println("--- Fin de l'affichage ---");
    }

    public void afficherInverse()
    {
        System.out.println("--- Affichage des éléments dans l'ordre inverse ---");

        LinkedList<String> buffer;
        buffer = (LinkedList<String>)l_list.clone();
        Collections.reverse(buffer);

        for(String s : buffer)
            System.out.println(s);

        System.out.println("--- Fin de l'affichage ---");
    }

    public void estPresent(String contenu)
    {
        if (l_list.contains(contenu))
            System.out.println("La chaine de caractère " + contenu + " est présent dans la liste");
        else
            System.out.println("La chaine de caractère " + contenu + " n'est pas présent dans la liste");
    }

    public void supprimerElement(String contenu)
    {
        l_list.remove(contenu);
    }

    public void supprimerElementDebut()
    {
        l_list.removeFirst();
    }

    public void echangerDeuxElement(String contenu_1, String contenu_2)
    {
        Collections.swap(l_list, l_list.indexOf(contenu_1), l_list.indexOf(contenu_2));
    }

    public void melanger()
    {
        Collections.shuffle(l_list);
    }

    public LinkedList<String> dupliquer()
    {
        return (LinkedList<String>)l_list.clone();
    }

    public String recupererElementDebut()
    {
        return l_list.peekFirst();
    }

    public String recupererElementFin()
    {
        return l_list.peekLast();
    }

    public void remplacer(int index, String contenu)
    {
        l_list.set(index, contenu);
    }

    public ArrayList<String> convertirArrayList()
    {
        return new ArrayList<String>(l_list);
    }

    public void estVide()
    {
        if (l_list.isEmpty())
            System.out.println("La liste chainée est vide");
        else
            System.out.println("La liste chainée n'est pas vide");
    }

    public boolean comparer(LinkedList<String> list_1, LinkedList<String> list_2)
    {
        if (list_1.isEmpty()) {
            System.out.println("La liste 1 est vide");
            return false;
        }
        else if (list_2.isEmpty()) {
            System.out.println("La liste 2 est vide");
            return false;
        }
        else
        {
            if (list_1.equals(list_2)) {
                System.out.println("Les deux listes sont identiques");
                return true;
            }
            else {
                System.out.println("Les deux listes ne sont pas identiques");
                return false;
            }
        }
    }
}