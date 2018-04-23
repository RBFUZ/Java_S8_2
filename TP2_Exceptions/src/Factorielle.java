import java.util.Scanner;
import java.text.DecimalFormat;

public class Factorielle {

    private static Scanner reader;

    public Factorielle()
    {
        reader = new Scanner(System.in);
    }

    public static void main(String[] args) {

        try {
            Factorielle factorielle = new Factorielle();

            System.out.println("Factorielle : " + factorielle.calcul(factorielle.reader()));

        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println(exception.getMessage());
        } catch (NumberFormatException exception) {
            System.out.println("L'argument doit être entier");
        } catch (ExceptionNombreNegatif exception) {
            System.out.println(exception.getMessage());
        } catch (ExceptionGrand exception) {
            System.out.println(exception.getMessage());
        } finally {
            reader.close();
        }
    }

    public String calcul(int nombre) throws ExceptionGrand, ExceptionNombreNegatif
    {
        int factorielle = 1;

        if (nombre < 0) // Si le nombre est négatif, le programme lance une exception et se termine.
            throw new ExceptionNombreNegatif(nombre + " est négatif : la factorielle n'est pas définie");

        for (int i = 1; i <= nombre; i++)
        {
            if (((long)factorielle * i) < Integer.MAX_VALUE) // Vérifie si le nombre fournie par l'utilisateur n'est pas trop grand pour le calcul.
                factorielle = factorielle * i;
            else
                throw new ExceptionGrand("ExceptionGrand: " + nombre + " est trop grand pour ce programme");
        }

        DecimalFormat myFormatter = new DecimalFormat("###,###,###");
        return myFormatter.format(factorielle);
    }

    public int reader() throws ArrayIndexOutOfBoundsException
    {
        System.out.println("Entier : ");
        String chaine = reader.nextLine();

        if (chaine.equals("")) // Si l'argument est vide
            throw new ArrayIndexOutOfBoundsException("Indiquez le nombre d'entiers sur la ligne de commande");

        return Integer.parseInt(chaine);
    }
}