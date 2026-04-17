
public class SelectionSort {


    public static void SS(int arr[]){

        for (int i = 0; i < arr.length-1; i++) {
            int minIndex=i;
            for (int j = i+1; j < arr.length; j++) {

                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
                
            }

            int temp;
            temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
            
        }


    }
public static void main(String[] args) {
    
int arr[]={2,9,12,5,8};
System.out.println("before sorting");
for (int i : arr) {
    System.out.print("="+i);
    
}
SS(arr);

System.out.println("\n after sorting");
for (int i : arr) {
    System.out.print("="+i);
    
}
}

    
}
