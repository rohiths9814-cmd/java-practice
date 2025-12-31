public class linearSearch {
    public static void main(String[] args) {
        
        int[] arr = {5, 10, 15};

        int target = 5;

        for(int i = 0 ; i < arr.length ; i++){

            if(arr[i] == target){
                System.out.println("Found at index "+ i);
                break;
            }else{
                System.out.println("Not found");
            }
        }
    }
}
