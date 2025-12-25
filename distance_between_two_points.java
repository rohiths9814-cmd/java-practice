public class distance_between_two_points {
    public static void main(String[] args) {
        double x1 = 3.0;
        double y1 = 4.0;
        double x2 = 7.0;
        double y2 = 1.0;

        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("Distance between the two points is: " + distance);
    }
}
