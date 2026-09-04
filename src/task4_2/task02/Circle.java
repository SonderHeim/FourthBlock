package task4_2.task02;

public class Circle {
    double radius;
    double centerX;
    double centerY;

    public Circle() {
        radius = 1;
        centerX = 0;
        centerY = 0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, double centerX, double centerY) {
        this(radius);
        this.centerX = centerX;
        this.centerY = centerY;
    }

    public Circle(Circle circle) {
        this.radius = circle.radius;
        this.centerX = circle.centerX;
        this.centerY = circle.centerY;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public boolean contains(double pointX, double pointY) {
        double distance = Math.sqrt(Math.pow(pointX - centerX, 2) + Math.pow(pointY - centerY, 2));

        return distance < radius;
    }

    public boolean intersects(Circle circle) {
        double distance = Math.sqrt(Math.pow(circle.centerX - centerX, 2) + Math.pow(circle.centerY - centerY, 2));

        return distance < radius + circle.radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5, 4, 4);
        Circle circle1 = new Circle(4, 5, 5);

        System.out.println("Площадь круга: " + circle.area());
        System.out.println("Периметр круга: " + circle.perimeter());
        System.out.println(circle.contains(4, 5) ? "Точка входит в состав круга." : "Точка не входит в состав круга.");
        System.out.println(circle.intersects(circle1) ? "Данная окружность пересекается с другой." : "Данная окружность не пересекается с другой.");
    }
}
