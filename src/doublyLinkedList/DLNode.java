package doublyLinkedList;

/**
 * Created by 609540082 on 05/08/2018.
 */
public class DLNode {

    int data ;
    DLNode next;
    DLNode prev;
    int length;
    public DLNode()
    {}
    public DLNode(int a )
    {
        data= a;

    }

    public boolean isEmpty()
    {
        return length ==0;
    }
}
