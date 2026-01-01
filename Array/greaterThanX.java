public class greaterThanX {
    public static void main(String[] args) {
        
        int[] arr = {1, 4, 6, 2, 8};

        int x = 4;

        int count = 0;

        for(int i = 0 ; i < arr.length ; i++){

            if(arr[i] > x){
                count++;
            }
        }

        System.out.println(count);
    }
}
