package lesson12.problem2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomerAccount account = new CustomerAccount("John Doe", "123456", 200);
        System.out.println("Account details: " + account);

        try {
            account.deposit(100);
            account.withdraw(50);
            account.withdraw(200);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        } catch (LowBalanceException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }

        System.out.println("Final Account Details: " + account);
    }
}
