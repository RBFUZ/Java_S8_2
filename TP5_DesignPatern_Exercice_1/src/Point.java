public class Point implements Figure {

    private int taille;
    private int position;

    public void dessine()
    {
        System.out.println("Dessiner le point");
    }

    public void translate()
    {
        System.out.println("Translater le point");
    }

    public int getTaille() {
        return taille;
    }

    public void getPosition() {
        System.out.println("Le point est situé au coordonnée " + position);
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
