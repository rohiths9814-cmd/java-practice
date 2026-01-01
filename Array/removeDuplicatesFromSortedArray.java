public class removeDuplicatesFromSortedArray {
    public static void main(String[] args) {
        
        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        int index = 1;

        for(int i = 1 ; i < nums.length ; i++){

            if(nums[i] != nums[i-1]){
                nums[index] = nums[i];
                index++;
            }
        }

        for(int i = 0 ; i < index ; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
