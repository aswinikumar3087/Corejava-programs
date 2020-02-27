package linkedlist;

/**
 * Created by 609540082 on 11/07/2018.
 */
public class FindElementFromLast {

    Node head;

    public static void main(String [] args)
    {
        FindElementFromLast findElementFromLast = new FindElementFromLast();
        findElementFromLast.push(5);
        findElementFromLast.push(4);
        findElementFromLast.push(3);
        findElementFromLast.push(2);
        findElementFromLast.push(1);
        findElementFromLast.print();
            System.out.println("nth element :: "+findElementFromLast.findNodeAtNthposition(findElementFromLast.head));

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

    //print nth node from last with recursive approach

    public int findNodeAtNthposition(Node head )
    {

        Node counter1 = head;
        Node counter2 = head.next.next;

        if(counter1!= null && counter2!=null)
        {
            while(counter2.next!=null)
            {
                counter1 = counter1.next;
                counter2 = counter2.next;
            }

        }
        return counter1.data;
    }

}
