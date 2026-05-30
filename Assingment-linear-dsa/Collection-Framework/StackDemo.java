import java.util.Stack;
public class StackDemo {



    public static void main(String[] args) {
        
        Stack<String> s=new Stack<String>();
        s.push("java");
        s.push("c++");
        s.push("js");
        s.push("python");

        System.out.println("delete top elements ==="+s.pop());
        System.out.println("return top elements ==="+s.peek());
        System.out.println("return position of js  elements =="+s.search("js"));
        System.out.println("stack is empty or not =="+s.isEmpty());
    }
    
}
