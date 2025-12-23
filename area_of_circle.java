import java.util.Scanner;

public class area_of_circle {
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);

        System.out.print("Enter the radius of circle: ");
        int rad=in.nextInt();

        double area=3.14*rad*rad;

        System.out.println("The area of circle is " + area);
        
    }
}
