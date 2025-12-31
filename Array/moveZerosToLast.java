import java.util.Arrays;

public class moveZerosToLast {
    public static void main(String[] args) {
        
        int[] arr = { 0, 1, 0, 21, 0 , 31, 0, 41, 0, 51};

        int index = 0;

        for(int i = 0 ; i < arr.length ; i++){

            if(arr[i] != 0){
                arr[index] = arr[i];
                index++;
            }
        }

        while(index < arr.length){
            arr[index] = 0;
            index++;
        }

        System.out.println(Arrays.toString(arr));
    }
}
