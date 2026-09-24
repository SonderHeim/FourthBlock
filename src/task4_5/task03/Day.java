package task4_5.task03;

public enum Day {
    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота"),
    SUNDAY("Воскресенье");

    private final String rusName;

    Day(String rusName) {
        this.rusName = rusName;
    }

    public boolean isWeekend() {
        if (this == SATURDAY || this == SUNDAY) {
            return true;
        }

        return false;
    }

    public boolean isWorkday() {
        return !isWeekend();
    }

    public static void main(String[] args) {
        for (Day day : Day.values()) {
            System.out.println("Сегодня: " + day.rusName
                    + " и это "
                    + (day.isWeekend() ? "выходной день." : "рабочий день."));
        }
    }
}
