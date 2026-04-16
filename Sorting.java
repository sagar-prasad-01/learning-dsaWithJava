public class Sorting {
    // bubble sort

    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j < arr.length - i; j++) {
                if (arr[i] > arr[j]) {
                    int temp;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }

            }

        }

    }

    public static void main(String[] args) {
        System.out.print("before sorting \n");
        int x[] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        for (int i : x) {
            System.out.print("="+i);
            
        }
        bubbleSort(x);
   
        System.out.print("\nafter sorting\n");

        for (int i : x) {
            System.out.print("="+i);
            
        }
    }

}
