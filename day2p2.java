import java.util.Scanner;

public class day2p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstname = sc.nextLine();

        System.out.print("Enter your last name: ");
        String Lastname = sc.nextLine();

        System.out.println("full name is: " + firstname + " " + Lastname);

    }
}
