// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.ArrayList;
import java.util.Scanner;

public class arr{


   public static void main(String[] var0) {
    
      ArrayList list=new ArrayList();
      list.add(10);
      list.add("sagar");
      list.add(true);

      System.out.println(list);
      System.out.println("printing arraylist one by one");

      for (int i = 0; i <list.size(); i++) {
         Object x=list.get(i);
         System.out.println(x);
         
      }
      
      for (Object x : list) {
         System.out.println(x);

         
      }

      ArrayList<integer> list=new ArrayList<integer>();
}
}
