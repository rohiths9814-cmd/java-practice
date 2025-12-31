import java.util.Arrays;

public class reverseAnArray {
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 5};

        int end = arr.length - 1 ;

        int start;

        for(start = 0 ; start < end ; start++ ){

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            end--;
        }

        System.out.print(Arrays.toString(arr));
    }
}
