
public class Array_DS {

    // Complete the reverseArray function below.
    static int[] reverseArray(int[] a) {

        int len = a.length - 1;
        for(int i = 0; i <= len/2; i++) {
            swap(a, i, len - i);
        }
        return a;
    }

    // swapping the elements in the same array 
    private static void swap(int[] a, int start, int end){
        int temp = a[start];
        a[start] = a[end];
        a[end] = temp;
    }
}
