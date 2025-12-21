import java.util.Scanner;

public class day2p1 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int num1=sc.nextInt();

        System.out.print("Enter number 2: ");
        int num2=sc.nextInt();
        int sum=num1+num2;
        int diff=num1-num2;
        int product=num1*num2;
        int quotient=num1/num2;
        int remainder=num1%num2;

        System.out.println("Sum = " + sum);
        System.out.println("Difference = " +diff);
        System.out.println("Product = " +product);
        System.out.println("Quotient = " +quotient);
        System.out.println("Remainder = " +remainder);
    }
    
}
