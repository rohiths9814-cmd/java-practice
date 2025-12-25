import java.util.Scanner;

public class area_of_rectangle {
    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);

        int length;
        int breadth;

        System.out.print("Enter the length of rectangle: ");
        length = in.nextInt();
        System.out.print("Enter the breadth of rectangle: ");
        breadth = in.nextInt();

        int area = length * breadth;

        System.out.println("The area of rectangle is: " + area);

    }
}