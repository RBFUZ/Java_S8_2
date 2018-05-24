public class ProgrammePrincipal {

    public static void main(String[] args) {

    Composite ma_figure = new Composite();

    // Création des points
    Point point_1 = new Point();
    point_1.setTaille(19);
    point_1.setPosition(14);

    Point point_2 = new Point();
    point_2.setTaille(12);
    point_2.setPosition(25);

    Point point_3 = new Point();
    point_3.setTaille(19);
    point_3.setPosition(12);


    // Création des lignes
    Ligne ligne_1 = new Ligne();
    ligne_1.setTaille(19);
    ligne_1.setPosition(11);

    Ligne ligne_2 = new Ligne();
    ligne_2.setTaille(13);
    ligne_2.setPosition(37);


    // Création du cercle
    Cercle cercle_1 = new Cercle();
    cercle_1.setTaille(49);
    cercle_1.setPosition(44);


    // Ajout des figure à ma figure (objet composite)
    ma_figure.addFigure(point_1);
    ma_figure.addFigure(point_2);
    ma_figure.addFigure(point_3);
    ma_figure.addFigure(ligne_1);
    ma_figure.addFigure(ligne_2);
    ma_figure.addFigure(cercle_1);

    // Dessiner ma_figure
    ma_figure.dessinerLaFigure();

    // Translater ma_figure
    ma_figure.translaterLaFigure();

    // Afficher la taille de la figure
    ma_figure.getTaille();

    // Afficher les positions des figures simples
    ma_figure.getPosition();
    }
}