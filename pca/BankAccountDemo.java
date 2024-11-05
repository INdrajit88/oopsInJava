class Account {
    String name;
    int accountNumber;
    String accountType;
    double balance;

    void setDetails(String name, int accountNumber, String accountType) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited: " + amount);
    }

    void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}

class Curr_Acct extends Account {
    private final int MIN_BALANCE = 1000;
    private final int PENALTY = 100;

    void checkMinBalance() {
        if (balance < MIN_BALANCE) {
            balance -= PENALTY;
            System.out.println("Minimum balance not maintained. Penalty of Rs. 100 imposed.");
        }
    }

    void withdraw(double amount) {
        if (balance - amount >= MIN_BALANCE) {
            balance -= amount;
            System.out.println("Amount withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance to withdraw.");
        }
        checkMinBalance();
    }
}

class Savn_Acct extends Account {
    void computeInterest(double interestRate) {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest added: " + interest);
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Amount withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance to withdraw.");
        }
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        Curr_Acct currentAccount = new Curr_Acct();
        currentAccount.setDetails("John Doe", 12345, "Current");
        currentAccount.deposit(2000);
        currentAccount.withdraw(1500);
        currentAccount.displayBalance();

        Savn_Acct savingsAccount = new Savn_Acct();
        savingsAccount.setDetails("Jane Smith", 54321, "Savings");
        savingsAccount.deposit(1000);
        savingsAccount.computeInterest(5);
        savingsAccount.displayBalance();
    }
}