package task4_1.task02;

public class BankAccount {
    public static int totalAccounts = 0;

    String accountNumber;
    String owner;
    private double balance;

    public BankAccount() {
        totalAccounts++;
    }

    public void deposit(int balance) {
        this.balance += balance;
    }

    public void withdraw(int balance) {
        if (this.balance >= balance)
            this.balance -= balance;
        else
            System.out.println("Недостаточно средств на счёте.");
    }

    public void getBalance() {
        System.out.println("Баланс: " + balance);
    }

    public void printStatement() {
        System.out.println("Пользователь " + owner + " с лицевым счётом " + accountNumber + " имеет " +
                balance + " рублей.");
    }

    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.accountNumber = "123456";
        bankAccount1.owner = "Maker";
        bankAccount1.deposit(1000);
        bankAccount1.withdraw(1001);
        bankAccount1.withdraw(900);
        bankAccount1.getBalance();
        bankAccount1.printStatement();

        BankAccount bankAccount2 = new BankAccount();
        bankAccount2.accountNumber = "12345621";
        bankAccount2.owner = "Godwin";
        bankAccount2.deposit(1000);
        bankAccount2.withdraw(900);
        bankAccount2.getBalance();
        bankAccount2.printStatement();

        System.out.println("Всего аккаунтов: " + BankAccount.totalAccounts);
    }
}
