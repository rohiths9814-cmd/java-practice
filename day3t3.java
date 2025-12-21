import java.util.Scanner;

public class day3t3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();

        if(a>=90 && a<=100){
            System.out.println("A");
        }
        else if(a>=75 && a<90){
            System.out.println("B");
        }
        else if(a>=50 && a<74){
            System.out.println("C");
        }
        else{
            System.out.println("Fail");
        }
    }
}
