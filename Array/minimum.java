public class minimum {
    public static void main(String[] args) {
        
        int[] arr = {7, 3, 9, 1};

        int min = Integer.MAX_VALUE;

        for(int i =0 ; i < arr.length ; i++){

            if(arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println(min);
    }
}
