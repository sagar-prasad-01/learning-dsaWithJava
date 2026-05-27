import java.util.ArrayList;
import java.util.Collections;

public class AL {

    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        list.add("sagar");
        list.add("ram");
        list.add("mohan");
        list.add("sohan");
        list.add("ahan");

        System.out.println(list);
        list.set(1,"rohan");
        System.out.println("after updation"+list);
        list.remove("rohan");
        System.out.println("after delleted rohan"+list);

        Collections.sort(list);
        System.out.println("data after sorting"+list);
    }
    
}
