public class CircularSinglyLL {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }

    }

    public static void printList(Node head, Node tail) {
        Node temp = head;
        do {
            System.out.print(temp.data + "==>");

            temp = temp.next;

        } while (temp != head);

    }

    public static void main(String[] args) {

        Node a = new Node(2);
        Node b = new Node(4);
        Node c = new Node(6);
        Node d = new Node(8);
        Node head = a;
        Node tail = d;
        head.next = b;
        head.next.next = c;
        head.next.next.next = d;
        tail.next = a;
        printList(head, tail);

    }

}
