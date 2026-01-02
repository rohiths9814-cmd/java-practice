public class Main {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 3,5 ,6, 7, 2, 4, 3, 3, 4,3,9};   // sample input

        int result = -1;

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] || nums[i] == nums[i - 2]) {
                result = nums[i];
                break;
            }
        }

        if (result == -1) {
            result = nums[0];
        }

        System.out.println(result);
    }
}
