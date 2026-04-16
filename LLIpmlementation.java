public class LLIpmlementation {



    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            next=null;
        }

        public static class linkedlist{
           public static Node head=null;
            public static Node tail=null;

            public static void addFirst(int data){
                Node newNode=new Node(data);
                head=newNode;
                newNode.next=null;
            }

            public static void printList(){
                Node temp=head;
                while(temp!=null){
                    System.out.println("=="+temp.data);
                    temp=temp.next;
                }

            }

        }


        public static void main(String[] args) {
            linkedlist ll=new linkedlist();
            ll.addFirst(1);
            ll.printList();
            
        }


    }
    
}
