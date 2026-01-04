public class MaximumElement {
    public static void main(String[] args) {
        
        int[] arr = {3, 7, 2, 9, 4};

        int max = Integer.MIN_VALUE;

        for(int i = 0 ; i < arr.length ; i++){

            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}
