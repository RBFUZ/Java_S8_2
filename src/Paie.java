public class Paie {

    public static void main(String[] args) {

        Ouvriers ouvriers = new Ouvriers("robert", 14, "00000", 40, 9.6);
        ouvriers.getSalaire();
        System.out.println(ouvriers.salaire());


        Cadres cadres = new Cadres("robert", 14, "00000", 40, 9.6);
        cadres.getSalaire();
        System.out.println(cadres.salaire());

        Commerciaux commerciaux = new Commerciaux("robert", 14, "00000", 500);
        commerciaux.getSalaire();
        System.out.println(commerciaux.salaire());
    }
}