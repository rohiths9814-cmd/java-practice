public class SecondLargest {
    public static void main(String[] args) {

        int[] arr = {5, 1, 4, 2, 3};

        if (arr.length < 2) {
            System.out.println("Second largest element does not exist");
            return;
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > first) {
                second = first;   
                first = arr[i];
            } 
            else if (arr[i] < first && arr[i] > second) {
                second = arr[i];
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("Second largest element does not exist");
        } else {
            System.out.println("Second largest: " + second);
        }
    }
}
