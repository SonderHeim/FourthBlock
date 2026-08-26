package task4_1.task04;

public class Temperature {
    double value;

    public Temperature(double celsius) {
        this.value = celsius;
    }

    public static Temperature fromCelsius(double celsius) {
        Temperature temperature = new Temperature(celsius);

        return temperature;
    }

    public static Temperature fromFahrenheit(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;

        return new Temperature(celsius);
    }

    public static Temperature fromKelvin(double kelvin) {
        double celsius = kelvin - 273.15;

        return new Temperature(celsius);
    }

    public double toCelsius() {
        return value;
    }

    public double toFahrenheit() {
        return value * 9 / 5 + 32;
    }

    public double toKelvin() {
        return value + 273.15;
    }

    public void printAll() {
        System.out.println("Температура в цельсиях: " + toCelsius());
        System.out.println("Температура в фаренгейтах: " + toFahrenheit());
        System.out.println("Температура в кельвинах: " + toKelvin());
    }

    public static void main(String[] args) {
        Temperature celsius = Temperature.fromKelvin(280);
        celsius.printAll();
    }
}
