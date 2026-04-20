
public class InsertionSort {

    

    public static void Count(int n){


        if(n<0){
            return ;
        }
        

       
System.out.println(n); 
Count(n-1);
   }

    public static void main(String[] args) {

        Count(10);
    }
    
}
