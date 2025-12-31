public class frequency {
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 2, 2, 3, 4, 6, 2,2};

        int count = 0;

        int target = 2;

        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                count++;
            }
        }

        System.out.println("Frequency = " + count);
    }
}
