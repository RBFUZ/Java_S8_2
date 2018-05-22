import java.util.LinkedList;

public class MyLinkedList {

    private LinkedList<Object> l_list;

    public void ajouteEnTete(Object o)
    {
        l_list.addFirst(o);
    }

    public void ajouteEnQueue(Object o)
    {
        l_list.addLast(o);
    }

    public Object get(int index)
    {
        return l_list.get(index);
    }

    public Object trie()
    {
        return new Object();
    }
}
