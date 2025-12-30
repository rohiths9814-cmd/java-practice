package Array;

public class evenOdd {
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5};

        System.out.println("First element : "+arr[0]);
        System.out.println("Last element : " + arr[arr.length - 1]);

        int odd = 0;
        int even = 0;

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] % 2 == 0){
                even++;
            }else{
                odd++;
            }
        }

        System.out.println("Even = " + even);
        System.out.println("Odd = " + odd);
    }
}
