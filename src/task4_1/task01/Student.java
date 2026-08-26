package task4_1.task01;

public class Student {
    String name;
    String group;
    int age;
    double averageMark;

    public void printInfo() {
        System.out.println("Имя: " + name +
                "\nГруппа: " + group +
                "\nВозраст: " + age +
                "\nСредняя оценка: " + averageMark);
    }

    public boolean isExcellent() {
        if (averageMark >= 4.5) {
            System.out.println("Студент отличник.");
            return true;
        }

        System.out.println("Студент не отличник.");
        return false;
    }

    public boolean canGraduate(int minimumAge) {
        if (age >= minimumAge) {
            System.out.println("Студент может выпуститься.");
            return true;
        }

        System.out.println("Студент не может выпуститься.");
        return false;
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.age = 18;
        student1.group = "1";
        student1.name = "Oleg";
        student1.averageMark = 4.5;

        student1.printInfo();
        student1.canGraduate(20);
        student1.isExcellent();

        Student student2 = new Student();
        student2.age = 19;
        student2.group = "1";
        student2.name = "Mark";
        student2.averageMark = 4.1;

        student2.printInfo();
        student2.canGraduate(20);
        student2.isExcellent();

        Student student3 = new Student();
        student3.age = 23;
        student3.group = "2";
        student3.name = "Merk";
        student3.averageMark = 3.6;

        student3.printInfo();
        student3.canGraduate(20);
        student3.isExcellent();
    }
}
