import java.util.*;

public class LineAndDistance {
    public static double distance(double x1,double y1,double x2,double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    public static double[] lineEquation(double x1,double y1,double x2,double y2) {
        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;
        return new double[]{m, b};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble(), y1 = sc.nextDouble();
        double x2 = sc.nextDouble(), y2 = sc.nextDouble();
        System.out.println("Distance: " + distance(x1,y1,x2,y2));
        if (x2 == x1) System.out.println("Vertical line: x = " + x1);
        else {
            double[] eq = lineEquation(x1,y1,x2,y2);
            System.out.println("y = " + eq[0] + " * x + " + eq[1]);
        }
    }
}
