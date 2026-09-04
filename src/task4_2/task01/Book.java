package task4_2.task01;

public class Book {
    String title;
    String author;
    int yearPublication;
    int listsNumber;
    double price;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book(String title, String author, int yearPublication) {
        this(title, author);
        this.yearPublication = yearPublication;
    }

    public Book(String title, String author, int yearPublication, int listsNumber) {
        this(title, author, yearPublication);
        this.listsNumber = listsNumber;
    }

    public Book(String title, String author, int yearPublication, int listsNumber, double price) {
        this(title, author, yearPublication, listsNumber);
        this.price = price;
    }

    public void printInfo() {
        System.out.println(
                "Название книги: " + title +
                        "\nАвтор: " + author +
                        "\nГод публикации: " + yearPublication +
                        "\nКол-во страниц: " + listsNumber +
                        "\nЦена: " + price
        );
        System.out.println();
    }

    public boolean isClassic() {
        if (yearPublication < 1950) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Book book01 = new Book("День-ночь", "Владимир");
        Book book02 = new Book("Олег - замечательный друг, правда или вымысел?", "Грозный", 1920);
        Book book03 = new Book("По этапам в Воркуту", "Петя", 1934);
        Book book04 = new Book("Молочные зубы ребёнка", "Сена", 1966, 20);
        Book book05 = new Book("Молочные зубы ребёнка, том 2", "Сена", 1970, 22, 545);

        System.out.println(book04.isClassic());
        book01.printInfo();
        book02.printInfo();
        book03.printInfo();
        book04.printInfo();
        book05.printInfo();
    }
}
