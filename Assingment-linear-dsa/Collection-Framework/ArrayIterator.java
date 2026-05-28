
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class ArrayIterator {

    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        Iterator<Integer> itr=list.iterator();

        while(itr.hasNext()){
            int x=itr.next();
            if(x==3){
                itr.remove();

            }

            
        }
        System.out.println(list);
        
    }
    
}
