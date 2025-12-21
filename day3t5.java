import java.util.Scanner;

public class day3t5 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Enter nationality: ");
        String nation=sc.next();

        if(age>=18 && nation.equals("Indian")){
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible");
        }   
    }
}
