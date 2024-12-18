package lesson12.problem2;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class LowBalanceException extends Exception {
    public LowBalanceException(String message) {
        super(message);
    }
}

public class CustomerAccount {
    private String Cus_name;
    private String Acc_No;
    private double Balance;

    public CustomerAccount(String Cus_name, String Acc_No, double Balance) {
        this.Cus_name = Cus_name;
        this.Acc_No = Acc_No;
        this.Balance = Balance;
    }

    public boolean deposit(double amount) {
        if (amount < 0)
            return false;
        Balance += amount;
        System.out.print("Successfully deposited: $" + amount);
        System.out.println("! Current balance: $" + getBalance());
        return true;
    }

    public boolean withdraw(double amount) throws InsufficientFundsException, LowBalanceException {
        if (amount > Balance)
            throw new InsufficientFundsException("Error: Withdrawal amount exceeds the current balance!");
        Balance -= amount;
        System.out.print("Successfully withdrawn: $" + amount);
        System.out.println("! Current balance: $" + getBalance());
        if (Balance < 100)
            throw new LowBalanceException("Warning: Balance below $100!");
        return true;
    }

    public double getBalance() {
        return Balance;
    }

    @Override
    public String toString() {
        return "Customer name = " + Cus_name +
                ", a/c number = " + Acc_No +
                ", balance = " + Balance ;
    }
}

