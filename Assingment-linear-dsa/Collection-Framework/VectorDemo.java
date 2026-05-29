import java.util.Vector;
import java.util.Enumeration;

public class VectorDemo {

    public static void main(String[] args) {

        Vector<Integer> list = new Vector<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        Enumeration<Integer> en = list.elements();
        System.out.println("printing data with the help of enumeration");

        while(en.hasMoreElements()) {
            System.out.println(en.nextElement());
        }
    }
}