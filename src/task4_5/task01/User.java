package task4_5.task01;

public class User {
    private static int nextId = 0;

    private String name;
    private int id;

    public User(String name) {
        this.name = name;
        nextId++;
        id = nextId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getTotalCreated() {
        return nextId;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public static void main(String[] args) {
        User user = new User("Garhar");
        User user1 = new User("Moron");

        System.out.println(user);
        System.out.println("Всего аккаунтов: " + User.getTotalCreated());
    }
}
