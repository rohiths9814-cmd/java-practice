import java.util.Scanner;

public class day2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your grade: ");
        char grade = sc.next().charAt(0);

        System.out.print("Enter your percentage: ");
        float percentage = sc.nextFloat();

        System.out.print("Is passed ");
        boolean ispassed = sc.nextBoolean();


        System.out.println("Hello " + name + ", your are " +  age + " years old.");
        System.out.println("Grade : " +grade );
        System.out.println("Percentage : " +percentage );
        System.out.println("Is passed(true/false) : " +ispassed );
    }

}