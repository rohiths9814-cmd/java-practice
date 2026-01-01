import java.util.Scanner;

public class arrayIsStrictlyIncreasing {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        boolean result = true;

        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 1 ; i < arr.length ; i++){

            if(arr[i] <= arr[i-1]){
                result = false;
                System.out.println(result);
                return ;
            }
        }

        System.out.println(result);
    }
}
