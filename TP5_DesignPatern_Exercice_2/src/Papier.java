public class Papier implements Article {

    private String reference;
    private String nom;
    private String marque;
    private double prix;
    private String gammage;

    @Override
    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    @Override
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    @Override
    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getGammage() {
        return gammage;
    }

    public void setGammage(String gammage) {
        this.gammage = gammage;
    }
}
