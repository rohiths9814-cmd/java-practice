public class linearSearch {
    public static void main(String[] args) {
        
        int[] arr = {5, 10, 15};

        int index = -1;

        int target = 5;

        for(int i = 0 ; i < arr.length ; i++){

            if(arr[i] == target){
                index = i;
                break;
            }
        }

        System.out.println(index);
    }
}
