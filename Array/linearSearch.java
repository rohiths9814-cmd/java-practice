public class linearSearch {
    public static void main(String[] args) {
        
        int[] arr = {5, 10, 15};

        int target = 5;

        int index = -1;

        for(int i = 0 ; i < arr.length ; i++){

            if(arr[i] == target){
                index = i; 
                break;
            }
        }

        if (index != -1){
            System.out.println("Fount at index "+index);
        }else{
            System.out.println("Not found");
        }
    }
}
