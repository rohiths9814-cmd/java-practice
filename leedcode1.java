import java.util.Scanner;

public class leedcode1 {
    public static void main(String[] args) {
        
        int a;
        Scanner in = new Scanner(System.in);

        a= in.nextInt();

       System.out.print(subractProductAndSum(a));
    }

    static int subractProductAndSum(int n){

        int product=1,sum=0;

        while(n>0){
        int digit=n%10;
        product*=digit;
        sum+=digit;
        n/=10;
       }

       return product-sum;
    }
}
