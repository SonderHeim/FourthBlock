package task4_3.task04;

public class Main {
    public static void main(String[] args) {

        Course course1 = new Course(
                1,
                "Java Core",
                "Иванов",
                40,
                4500
        );

        Course course2 = new Course(
                2,
                "Spring Boot",
                "Петров",
                60,
                7000
        );

        Course course3 = new Course(
                1,
                "Java Core",
                "Иванов",
                40,
                4500
        );

        System.out.println(course1);
        System.out.println(course2);
        System.out.println(course3);

        System.out.println();

        System.out.println(course1.shortDescription());
        System.out.println("Премиум: " + course1.isPremium());

        System.out.println();

        System.out.println(course2.shortDescription());
        System.out.println("Премиум: " + course2.isPremium());

        System.out.println();

        System.out.println("course1 равен course2: " + course1.equals(course2));
        System.out.println("course1 равен course3: " + course1.equals(course3));
    }
}
