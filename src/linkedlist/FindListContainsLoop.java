package linkedlist;

import java.util.HashSet;

/**
 * Created by 609540082 on 13/07/2018.
 */
public class FindListContainsLoop {

    Node head;

    public static void main(String[] args) {

        FindListContainsLoop findListContainsLoop = new FindListContainsLoop();
        findListContainsLoop.push(1);
        findListContainsLoop.push(2);
        findListContainsLoop.push(3);
        findListContainsLoop.push(4);
        findListContainsLoop.head.next.next.next.next = findListContainsLoop.head;
        System.out.println("count nodes ::"+findListContainsLoop.findLoopInLinkedList(findListContainsLoop.head));

    }
    public void push(int data)
    {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }
    public int findLoopInLinkedList(Node node)
    {
       Node slowNode = head;
       Node fastNode = head;
          int count =0;
          while(slowNode!=null && fastNode!= null)
          {
           slowNode = slowNode.next;
           fastNode = fastNode.next.next;

           if(slowNode == fastNode)
           {
             return countNode(slowNode);
           }
          }
       return 0;
    }

    public int countNode(Node node)
    {
        Node temp = node;
        int count =1;
        while(node != temp.next)
        {
            count = ++count;
            temp = temp.next;
        }
        return count;
    }
}
