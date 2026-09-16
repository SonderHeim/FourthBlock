package task4_3.task01;

public class BankAccount {
    public static int totalAccounts = 0;

    String accountNumber;
    String owner;
    private double balance;

    String[] transactionHistory = new String[100];

    int transactionNumber = 0;

    public BankAccount() {
        totalAccounts++;
    }

    public void deposit(int balance) {
        if (balance <= 0) {
            System.out.println("Депозит должен быть положительным!");
        } else {
            this.balance += balance;
            transactionHistory[transactionNumber] = "+" + Integer.toString(balance);
            transactionNumber++;
        }
    }

    public void withdraw(int balance) {
        if (this.balance >= balance && balance > 0) {
            this.balance -= balance;
            transactionHistory[transactionNumber] = "-" + Integer.toString(balance);
            transactionNumber++;
        }
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

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void getTransactionHistory() {
        for (int i = 0; i < transactionNumber; i++) {
            System.out.println("Пользователь " + owner + ": " + transactionHistory[i]);
        }
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
        bankAccount1.getTransactionHistory();

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
