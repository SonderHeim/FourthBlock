package task4_4.task03;

import java.util.HashSet;
import java.util.Objects;

public class Student {
    private String name;
    private String email;
    private int age;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(email, student.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }

    public Student(int age, String email, String name) {
        this.age = age;
        this.email = email;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Student student1 = new Student(18,  "example@mail.com", "Agel");
        Student student2 = new Student(18,  "example@mail.com", "Agel");
        Student student3 = new Student(18,  "example@mail.com", "Agel");
        Student student4 = new Student(20,  "example@mail.com", "Agel");
        Student student5 = new Student(21,  "example@mail.com", "Agel");

        HashSet<Student> hashSet = new HashSet<>();
        hashSet.add(student1);
        hashSet.add(student2);
        hashSet.add(student3);
        hashSet.add(student4);
        hashSet.add(student5);

        System.out.println(hashSet.size());
        System.out.println(student1.equals(student2));
    }
}
