import java.util.Scanner;

public class area_of_triangle {
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);

        System.out.print("Enter the base of the triangle: ");
        int base = in.nextInt();
        System.out.print("Enter the height of the triangle: ");
        int height = in.nextInt();

        double area = 0.5*base*height;

        System.out.print("The area of triangle is "+area);
    
    }
}
