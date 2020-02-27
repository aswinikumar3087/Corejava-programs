package linkedlist;

/**
 * Created by 609540082 on 12/07/2018.
 */
public class MiddleElementInLinkedList {

    Node head;

    public static void main(String[] args) {
        MiddleElementInLinkedList middleElementInLinkedList =
                new MiddleElementInLinkedList();
        middleElementInLinkedList.push(6);
        middleElementInLinkedList.push(5);
        middleElementInLinkedList.push(4);
        middleElementInLinkedList.push(3);
        middleElementInLinkedList.push(2);
        middleElementInLinkedList.push(1);

        System.out.println(middleElementInLinkedList.returnMiddleElement());
        middleElementInLinkedList.print();
    }
    public void push(int data)
    {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }
    public void print()
    {
        Node current = head;
        while (current!= null)
        {
            System.out.println("Current node elemt = "+current.data);
            current = current.next;
        }
    }
public int returnMiddleElement()
{
    Node fastNode = head;
    Node slowNode = head;

    while(fastNode!= null && fastNode.next!=null)
    {
        fastNode = fastNode.next.next;
        slowNode = slowNode.next;
    }
    return slowNode.data;
}

}
