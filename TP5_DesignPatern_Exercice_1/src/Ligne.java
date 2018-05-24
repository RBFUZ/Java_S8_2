public class Ligne implements Figure {

    private int taille;
    private int position;

    public void dessine()
    {
        System.out.println("Dessiner la ligne");
    }

    public void translate()
    {
        System.out.println("Translater la ligne");
    }

    public int getTaille() {
        return taille;
    }

    public void getPosition() {
        System.out.println("La ligne est située au coordonnée " + position);
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
