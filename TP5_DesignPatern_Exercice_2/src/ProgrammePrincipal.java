public class ProgrammePrincipal {

    public static void main(String[] args) {

        Composite articles = new Composite();
        articles.setPourcentage(20);


        // ---- Affichage d'un seul article ---- //
        System.out.println("----- ARTICLE SEUL -----");
        Stylo stylo_1 = new Stylo();
        stylo_1.setReference("A4 HB");
        stylo_1.setNom("Stylo plume mine A3");
        stylo_1.setMarque("Maped");
        stylo_1.setCouleur("Noir");
        stylo_1.setPrix(100);

        // Ajout de l'article
        articles.addArticle(stylo_1);

        // Affichages des informations du(des) article(s)
        articles.getReference();
        articles.getNom();
        articles.getMarque();
        articles.getPrix();

        articles.getChildren().clear();

        // ---- Affichage d'un lot ---- //
        System.out.println("\n----- LOT DE STYLOS -----");
        for (int i = 0; i < 10 ; i++)
            articles.addArticle(stylo_1);

        // Affichages des informations du(des) article(s)
        articles.getReference();
        articles.getNom();
        articles.getMarque();
        articles.getPrix();

        articles.getChildren().clear();


        // ---- Affichage d'un lot ---- //
        System.out.println("\n----- LOT DE PAPIER -----");
        Papier papier_1 = new Papier();
        papier_1.setReference("A4");
        papier_1.setMarque("Une marque de papier random");
        papier_1.setNom("Ramette de papier A4");
        papier_1.setPrix(50);
        papier_1.setGammage("80 mm");

        for (int i = 0; i < 10 ; i++)
            articles.addArticle(papier_1);

        // Affichages des informations du(des) article(s)
        articles.getReference();
        articles.getNom();
        articles.getMarque();
        articles.getPrix();

        articles.getChildren().clear();
    }
}
