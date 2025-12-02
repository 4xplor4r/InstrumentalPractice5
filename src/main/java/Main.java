import java.lang.Math;

class Main {
    public static double calculateRectangleSquare(double a, double b) {
        double s = (a + a) + (b + b);
        return s;
    }

    public static double calculateTriangleSquare(double a, double b) {
        double s = 1.0/2 * a * b * Math.sin(Math.toRadians(90));
        return s;
    }

    public static double calculateTrapezoidSquare(double a, double b, double h) {
        double s = (a + b) / 2 * h;
        return s;
    }

    public static void main(String[] args) {
        System.out.println("Это добавлено в ветке master");

        System.out.println(calculateRectangleSquare(2.1, 4.5));
        System.out.println(calculateTriangleSquare(3.0, 4.0));
        System.out.println(calculateTrapezoidSquare(7.1, 8.4, 2.0));
    }
}
