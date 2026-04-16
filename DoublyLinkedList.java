
public class DoublyLinkedList {

    public static class Node {
        Node prev;
        int data;
        Node next;

        public Node(int data) {
            prev = null;
            this.data = data;
            next = null;

        }
    }

    public static class LinkedList {
        public static Node head;
        public static Node tail;

        public static void addFirst(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;

                System.out.println("ruteuned");
                return;
            }
            newNode.next = head;
            head.prev = newNode;
            head = newNode;

        }

        public static void addLast(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;

                return;
            }
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;

        }

        public static void printListForward() {

            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "==");
                temp = temp.next;

            }

        }
          public static void printListBackward() {
            Node temp = tail;
            while (temp != null) {
                System.out.print(temp.data + "==");
                temp = temp.prev;

            }

        }

        public static void addAtPos(int pos, int data) {
            Node temp1, temp2;
            temp1 = head;
            temp2 = head.next;
            Node newNode = new Node(data);
            while (pos > 1) {
                pos--;
                temp1 = temp1.next;
                temp2 = temp2.next;

            }
            temp1.next = newNode;
            temp2.prev = newNode;
            newNode.prev = temp1;
            newNode.next = temp2;

        }

        public static Node delleteFirst() {

            head = head.next;
            head.prev = null;

            return head;
        }

        public static Node delleteLast() {
            tail = tail.prev;
            tail.next = null;
            return tail;

        }

       public static void delleteFromAnyPos(int pos) {
            Node temp1, temp2;
            temp1 = head;
            temp2 = head.next;
            while (pos > 1) {
                pos--;
                temp1 = temp1.next;
                temp2 = temp2.next;

            }
          temp2=temp2.next;
          temp2.prev=temp1;
          temp1.next=temp2;

        }




    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        System.out.println("hello   " + ll);
        ll.addFirst(5);
        ll.addFirst(6);
        ll.addLast(7);
        ll.addLast(8);
        ll.addAtPos(3, 77);
        ll.delleteFirst();
        ll.delleteLast();
      
        ll.addFirst(44);
        ll.addFirst(33);
        ll.addFirst(22);
        ll.delleteFromAnyPos(4);

          ll.printListForward();
          System.out.println("");
          ll.printListBackward();
    }
}
