import java.util.Scanner;

public class leedcode1 {
    public static void main(String[] args) {
        
        int n,product=1,sum=0;
        Scanner in = new Scanner(System.in);

       n= in.nextInt();

       while(n>0){
        int digit=n%10;
        product*=digit;
        sum+=digit;
        n/=10;
       }

       int result = product - sum;

       System.out.print(result);
    }
}
