package doublyLinkedList;


public class InsertAtBegin {

    DLNode head;
    DLNode tail;

    public InsertAtBegin()
    {
        head = null;
        tail = null;
    }
    public static void main(String[] args) {
        InsertAtBegin insertAtBegin = new InsertAtBegin();
        insertAtBegin.insertAtFirst(2);
        insertAtBegin.insertAtFirst(3);
        insertAtBegin.insertAtFirst(4);
        insertAtBegin.displayForward();
    }
    //Insert Node At begin
    public void insertAtFirst(int a)
    {
        DLNode node = new DLNode(a);
        if(node.isEmpty())
        {
            tail = node;
        }
        else
        {
            head.prev = node;
        }
        node.next = head;
        head = node;
        node.length = node.length+1;
    }
    public void insertAtEnd()
    {

    }
public void displayForward()
{
    if(head == null)
    {return;}
    DLNode temp = head;
    while(temp!=null)
    {
        System.out.println("elements in DL :: "+temp.data);
        temp = temp.next;
    }
}
public void displayBackward()
{

}
}
