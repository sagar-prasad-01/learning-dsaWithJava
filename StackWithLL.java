public class StackWithLL {

     public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;

        }
    }

    Node front=null;
    Node rear=null;
    public void enq(int data){
        Node newNode=new Node(data);
        if(front==null && rear==null){
            front =newNode;
            rear =newNode;
            System.out.println("insert first node at queqe");
            
        }
        else{
            rear.next=newNode;
            rear=newNode;
            System.out.println("inser node after first nodequeqe");

        }


    }

    public int deq(){

        int r=-1;
        if(front==null && rear==null){
            System.out.println("queqe is empty");

        }else if(front==rear){
            r=front.data;
            front=null;
            rear=null;
        }else{
            r=front.data;
            front=front.next;
        }
        return r;


    }

    public static void main(String[] args) {
        StackWithLL sk=new StackWithLL();
        sk.enq(10);
        sk.enq(20);
        sk.enq(30);
        System.out.println("deleted elements is "+sk.deq());
        System.out.println("deleted elements is "+sk.deq());
        System.out.println("deleted elements is "+sk.deq());
    }

    
}
