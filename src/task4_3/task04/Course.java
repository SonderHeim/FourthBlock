package task4_3.task04;

public record Course(
        int id,
        String title,
        String instructor,
        int durationHours,
        double price
) {
    public Course {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Название не должно быть пустым!");
        }

        if (durationHours <= 0) {
            throw new IllegalArgumentException("Кол-во часов должно быть больше нуля!");
        }

        if (price < 0) {
            throw new IllegalArgumentException("Цена не должна быть отрицательной!");
        }
    }

    public boolean isPremium() {
        if (this.price > 5000){
            return true;
        }

        return false;
    }

    public String shortDescription() {
        return title + " (" + durationHours + " ч.) - " + instructor;
    }
}