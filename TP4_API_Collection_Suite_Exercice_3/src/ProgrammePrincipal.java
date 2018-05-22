public class ProgrammePrincipal {

    public static void main(String[] args) {

        ListeDePoupees gestionPoupee = new ListeDePoupees();

        gestionPoupee.add(new Poupee(Type.Creuse, 20)); // OK
        gestionPoupee.add(new Poupee(Type.Creuse, 19)); // OK
        gestionPoupee.add(new Poupee(Type.Creuse, 15)); // OK
        gestionPoupee.add(new Poupee(Type.Creuse, 25)); // Erreur car trop grande par rapport à la dernière
        gestionPoupee.add(new Poupee(Type.Pleine, 12)); // OK
        gestionPoupee.add(new Poupee(Type.Creuse, 10)); // Erreur car la dernière est pleine
    }
}
