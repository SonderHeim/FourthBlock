package task4_2.task04;

public class Config {
    String host;
    int port;
    int maxConnections;
    int timeout;
    boolean debug;

    static int instanceCount = 0;

    {
        host = "localhost";
        port = 8080;
        maxConnections = 100;
        timeout = 30;
        debug = false;

        instanceCount++;
    }

    public Config() {
    }

    public Config(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public Config(String host, int port, int maxConnections, int timeout, boolean debug) {
        this.host = host;
        this.port = port;
        this.maxConnections = maxConnections;
        this.timeout = timeout;
        this.debug = debug;
    }

    public void printConfig() {
        System.out.printf("Хост: %s.%nПорт: %d%n" +
                "Максимальное кол-во соединений: %d%n" +
                "Таймаут через %d секунд%n" +
                "Дебаг включен: %b%n", host, port, maxConnections, timeout, debug);
    }

    public static void main(String[] args) {
        Config config1 = new Config();
        System.out.println("Config 1: ");
        config1.printConfig();
        System.out.println();

        Config config2 = new Config("192.168.1.1", 8080);
        System.out.println("Config 2: ");
        config2.printConfig();
        System.out.println();

        Config config3 = new Config("192.169.1.0", 8082, 200, 60, false);
        System.out.println("Config 3: ");
        config3.printConfig();
        System.out.println();

        System.out.println("Создано конфигов: " + Config.instanceCount);
    }
}