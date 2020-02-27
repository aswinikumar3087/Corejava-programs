package linkedlist.practice;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data= data;
        next=null;
    }
}
public class LinkedListPractice {
    static Node head;

    public static void main(String[] args) {

        //linkedListPractice.push(1);
       // linkedListPractice.printList();
        push(1);
        push(2);
        push(3);
        push(4);
        push(5);
        printList();

    }
    public static void push(int data){
     Node node = new Node(data);
        node.next = head;
        head = node;

    }
    public static void printList()
    {
        Node n = head;
        while (n != null) {
            System.out.println(n.data + " ");
            n = n.next;
        }
    }

}
