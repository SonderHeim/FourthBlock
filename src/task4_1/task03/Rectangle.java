package task4_1.task03;

public class Rectangle {
    double width;
    double height;

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return (width + height) * 2;
    }

    public boolean isSquare() {
        if (width == height)
            return true;
        else
            return false;
    }

    public void scale(double factor) {
        width *= factor;
        height *= factor;
    }

    public void printInfo() {
        System.out.println("Ширина прямоугольника: " + width +
                "\nВысота прямоугольника: " + height);
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        rectangle1.height = 10;
        rectangle1.width = 15;
        System.out.println("Площадь: " + rectangle1.area() +
                "\nПериметр: " + rectangle1.perimeter() +
                "\nЯвляется ли квадратом: " + rectangle1.isSquare());
        rectangle1.scale(2);
        System.out.println("Скейл на 2: ");
        rectangle1.printInfo();

        Rectangle rectangle2 = new Rectangle();
        rectangle2.height = 10;
        rectangle2.width = 10;
        System.out.println("Площадь: " + rectangle2.area() +
                "\nПериметр: " + rectangle2.perimeter() +
                "\nЯвляется ли квадратом: " + rectangle2.isSquare());
        rectangle2.scale(2);
        System.out.println("Скейл на 2: ");
        rectangle2.printInfo();
    }
}
