public class LL {

    public static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static class LinkedList {
        public static Node head = null;

        // Q-1)display the data

        public static void displayList() {
            Node temp = head;
            while (temp != null) {
                System.out.println("data = " + temp.data);
                temp = temp.next;
            }

        }

        // Q-2)display the data in reverse order

        public static void displayListReverse(Node temp) {
            if (temp == null) {
                return;
            }
            displayListReverse(temp.next);
            System.out.println("data = " + temp.data);

        }

        // Q3) count number of nodes
        public static void countNodes() {
            int cnt = 0;
            Node temp = head;
            while (temp != null) {
                cnt++;
                temp = temp.next;
            }
            System.out.println("total number of nodes = " + cnt);

        }

        // Q-4)add nodes at first
        public static void addFirst(int data) {
            Node newNode = new Node(data);
            Node temp = head;
            head = newNode;
            head.next = temp;

        }

        // Q-5)add nodes at last

        public static void addLast(int data) {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            System.out.println(temp.data);
            Node newNode = new Node(data);
            temp.next = newNode;

        }

        // Q-6)add nodes at any position

        public static void addAtpos(int data,int pos){

            Node temp1,temp2;
            temp1=head;
            temp2=head.next;
            
            while(pos>1){
                temp1=temp1.next;
                temp2=temp2.next;
                pos--;
            }
             Node newNode =new Node(data);
                temp1.next=newNode;
                newNode.next=temp2;
        }

    }

    public static void main(String[] args) {
        Node first = new Node(5);
        Node second = new Node(6);
        Node third = new Node(7);
        LinkedList k = new LinkedList();
        k.head = first;
        first.next = second;
        second.next = third;
        System.out.println("nodes in forward order===");
        k.displayList();
        System.out.println("nodes in reverse order===");
        k.displayListReverse(k.head);

        k.countNodes();
        k.addFirst(4); 

        k.displayList();
        k.addLast(12);

        k.displayList();
        k.addAtpos(66, 2);
        k.displayList();
      

    }

}
