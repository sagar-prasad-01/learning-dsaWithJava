public class LinkedList {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
            System.out.println("Node is created succefully");

        }
    }

    public static void printData(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "==>");
            temp = temp.next;
        }
        System.out.println("");

    }

    public static Node addFirst(int data, Node head) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return head;
    }

    public static void addLast(int data, Node head) {
        Node newNode = new Node(data);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;

    }

    public static void deleteAtPos(Node head, int pos) {
        Node temp1 = head;
        Node temp2 = head.next;
        pos--;

        while (pos > 1) {
            temp1 = temp1.next;
            temp2 = temp2.next;
            pos--;
        }
        System.out.println("list after deleting node at any position");
        Node temp3 = temp2;
        temp1.next = temp2.next;
        temp3 = null;

    }

    public static void main(String[] args) {
        System.out.println("hello LinkedList");
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);

        Node head = a;
        head.next = b;
        head.next.next = c;
        head.next.next.next = d;

        // all the calling here
        printData(head);
        head = addFirst(1, head);

        addLast(99, head);
        printData(head);

        deleteAtPos(head, 4);
        printData(head);
    }

}
