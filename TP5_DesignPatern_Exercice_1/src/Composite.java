import java.util.ArrayList;

public class Composite implements Figure {

    private ArrayList<Figure> children;
    private int taille = 0;

    // Constructeur par défaut
    public Composite()
    {
        children = new ArrayList<>();
    }

    // Ajout d'une nouvelle figure à la liste
    public void addFigure(Figure figure)
    {
        children.add(figure);
    }

    // Dessine la figure (en appelant chacune des figures simples)
    public void dessine()
    {
        for (Figure figure : children) {
            figure.dessine();
        }
    }

    // Translate la figure (en appelant chacune des figures simples)
    public void translate()
    {
        for (Figure figure : children) {
            figure.translate();
        }
    }

    // Cumule la taille de toutes les figures simples pour affichage
    public int getTaille()
    {
        for (Figure figure : children) {
            taille += figure.getTaille();
        }
        System.out.println("La taille de la figure est de " + taille + " cm");

        return taille;
    }

    // Affiche la position de chacune des figures simples
    public void getPosition() {
        for (Figure figure : children) {
            figure.getPosition();
        }
    }
}
