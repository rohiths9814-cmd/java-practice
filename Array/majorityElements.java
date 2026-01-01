public class majorityElements {
    public static void main(String[] args) {
        
        int[] arr = {1,2,6,3,6,2,4,8,9,4,7,5,2,4,6,1,7,5,6,2,6,1,6,6};

        int n = arr.length;

        int maxCount = 0;
        int mostFrequency = arr[0];

       for ( int i = 0 ; i < n ; i++){
            int count = 0;

            for(int j = 0 ; j < n ; j++){

                if(arr[i] == arr[j]){
                    count++;
                }
            }

            if(count > maxCount){
                maxCount = count;
                mostFrequency = arr[i];
            }
       }

       System.out.println("Most frequency elements: "+ mostFrequency);
       System.out.println("Frequency: " + maxCount);

       if(maxCount > n/2){
        System.out.println("Majority element: " + mostFrequency);
       }else{
        System.out.println("No majority elements");
       }
    }
}
