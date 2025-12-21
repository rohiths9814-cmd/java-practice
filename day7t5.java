public class day7t5 {
    public static int area(int side){
        return side*side;
    }
    public static int area(int l,int b){
        return l*b;
    }
    public static double area(double r){
        return 3.14*r*r;
    } 

    public static void main(String[] args){
        int squareArea = area(5);
        int rectangleArea = area(4,6);
        double circleArea = area(3.5);

        System.out.println("Area of Square: " + squareArea);
        System.out.println("Area of Rectangle: " + rectangleArea);
        System.out.println("Area of Circle: " + circleArea);
    }
    
}
