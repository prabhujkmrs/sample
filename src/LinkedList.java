import java.util.HashSet;
import java.util.Set;

public class LinkedList {

      static Node head;

    private static class Node{
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private void push(int x){
        Node newNode = new Node(x);
        newNode.next=head;
        head=newNode;
    }

    private boolean detectLoop(Node n){
        Set<Node> nodeSet = new HashSet<>();
        while (n != null){
            if(nodeSet.contains(n))
                return true;
            nodeSet.add(n);
            n = n.next;
        }
        return false;
    }

    public static void main(String [] args){

        LinkedList llist = new LinkedList();

        llist.push(20);
        llist.push(30);
        llist.push(40);

       llist.head.next.next.next=llist.head; //create a loop

        if(llist.detectLoop(head))
            System.out.println("loop detected");
        else
            System.out.println("loop not detected");
    }
}
