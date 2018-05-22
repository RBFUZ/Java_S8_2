import java.util.LinkedList;

public class ListeDePoupees extends LinkedList<Poupee> {

    public ListeDePoupees() {}

    @Override
    public boolean add(Poupee poupee)
    {
        if (!isEmpty())
        {
            if (getLast().getType() == Type.Pleine) {
                System.out.println("Ajout impossible : La derniere poupée est pleine");
                return false;
            }
            else
            {
                if (getLast().getTaille() <= poupee.getTaille()) {
                    System.out.println("Ajout impossible : La derniere poupée est trop petite");
                    return false;
                }
                else {
                    addLast(poupee);
                    return true;
                }
            }
        }
        else {
            addLast(poupee);
            return true;
        }
    }
}
