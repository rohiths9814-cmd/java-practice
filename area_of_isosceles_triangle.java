import java.util.Scanner;

public class area_of_isosceles_triangle {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int base,height;
        System.out.print("Enter the base: ");
        base = in.nextInt();
        System.out.print("Enter the height: ");
        height = in.nextInt();

        double area = (0.5) * base * height;
        System.out.println("Area of Isosceles Triangle is: " + area);       
    }
}