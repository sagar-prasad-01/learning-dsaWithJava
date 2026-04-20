//it is a fast searching algo for sorted array
//divide and conquarar used
public class BinarySearch {

    public static int BS(int arr[], int key) {

        int low = 0;
        int high = arr.length - 1;
       

        while (low <= high) {
             int mid = (low + high) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if ( key< arr[mid] ) {
                high = mid - 1;

            } else {
                low = mid +1;

            }

        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int result=BS(arr,2);
        if(result>-1){
            System.out.println("element is found at index  "+result);
        }
        else{
            System.out.println("element not found");
        }
        
    }

}
