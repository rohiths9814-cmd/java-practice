import java.util.Scanner;

public class day5t2 {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");

        int n=sc.nextInt();

        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int sum=0;

        for(int i=0;i<n;i++){
            sum+=arr[i];
        }

        System.out.print("Sum = " + sum);
    }
}
