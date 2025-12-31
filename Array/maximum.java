public class maximum {
    public static void main(String[] args) {
        
        int[] nums = {-5, -2, -9, -1};

        int max = Integer.MIN_VALUE;

        for(int i = 0 ; i < nums.length ; i++){

            if(nums[i] > max){
                max = nums[i];
            }
        }

        System.out.println(max);
    }
}
