import java.util.Scanner;

public class day7t3 {
    public static void chechEvenOdd(int n){

        if (n%2==0){
            System.out.print("Even number");
        }
        else{
            System.out.print("Odd number");
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();  

        chechEvenOdd(number);
    }
}
