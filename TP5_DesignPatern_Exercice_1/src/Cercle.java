public class Cercle implements Figure {

    private int taille;
    private int position;

    public void dessine()
    {
        System.out.println("Dessiner le cercle");
    }

    public void translate()
    {
        System.out.println("Translater le cercle");
    }

    public int getTaille() {
        return taille;
    }

    public void getPosition() {
        System.out.println("Le cercle est situé au coordonnée " + position);
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
