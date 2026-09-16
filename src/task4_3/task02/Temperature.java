package task4_3.task02;

public class Temperature {
    private double celsius;

    public void getCelsius() {
        System.out.println("Температура по градусам Цельсии: " + celsius);
    }

    public void getFahrenheit() {
        System.out.println("Температура по Фаренгейту: " + celsius * 9 / 5 + 32);
    }

    public void getKelvin() {
        System.out.println("Температура по Кельвину: " + celsius + 273.15);
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public void setFahrenheit(double fahrenheit) {
        this.celsius = (fahrenheit - 32) * 5 / 9;
    }

    public void setKelvin(double kelvin) {
        this.celsius = kelvin - 273.15;
    }

    @Override
    public String toString() {
        return "Цельсии: " + celsius +
                "\nФаренгейты: " + (celsius * 9 / 5 + 32) +
                "\nКельвины: " + (celsius + 273.15);
    }

    public static void main(String[] args) {
        Temperature temperature = new Temperature();
        temperature.setCelsius(25);
        System.out.println(temperature);
    }
}
