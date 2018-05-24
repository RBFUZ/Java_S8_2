import java.util.ArrayList;

public class Composite implements Article {

    private ArrayList<Article> children;
    private double pourcentage = 0.0;

    public Composite()
    {
        children = new ArrayList<>();
    }

    public void addArticle(Article article)
    {
        children.add(article);
    }

    @Override
    public String getReference()
    {
        if (children.size() != 0) {
            if (children.size() > 1)
                System.out.println("Le lot à la reference suivante : " + children.get(0).getReference());
            else
                System.out.println("L'article à la référence : " + children.get(0).getReference());

            return children.get(0).getReference();
        }
        return null;
    }

    @Override
    public String getNom()
    {
        if (children.size() != 0) {
            if (children.size() > 1) {
                System.out.println("Lot de " + children.size() + " " + children.get(0).getNom() + " de la marque " + children.get(0).getNom());
            } else
                System.out.println("Article de nom " + children.get(0).getNom() + " et de marque " + children.get(0).getNom());

            return children.get(0).getNom();
        }
        return null;
    }

    @Override
    public String getMarque()
    {
        if (children.size() != 0) {
            if (children.size() > 1)
                System.out.println("Le lot à la marque suivante : " + children.get(0).getMarque());
            else
                System.out.println("L'article à la marque : " + children.get(0).getMarque());

            return children.get(0).getMarque();
        }
        return null;
    }

    @Override
    public double getPrix()
    {
        double prix = 0.0;

        if (children.size() != 0) {
                prix += children.size() * children.get(0).getPrix() * (100 - pourcentage) / 100;

            if (children.size() > 1)
                System.out.println("Le prix du lot est de : " + prix);
            else
                System.out.println("Le prix de l'article est de : " + prix);
        }
        return prix;
    }

    public double getPourcentage() {
        return pourcentage;
    }

    public void setPourcentage(double pourcentage) {
        this.pourcentage = pourcentage;
    }

    public ArrayList<Article> getChildren() {
        return children;
    }
}
