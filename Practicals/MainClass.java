import java.util.Scanner;

class InsufficientBalanceException extends Exception {

    InsufficientBalanceException(String message) {
        super(message);
    }
}

class Bank {

    int balance = 5000;

    void withdraw(int amount) throws InsufficientBalanceException {

        if (amount > balance) {

            throw new InsufficientBalanceException("Insufficient Balance");
        }

        else {

            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance = " + (balance - amount));
        }
    }
}

class MainClass {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        Bank b = new Bank();

        System.out.print("Enter withdrawal amount: ");
        int amount = sc.nextInt();

        try {

            b.withdraw(amount);
        }

        catch (InsufficientBalanceException e) {

            System.out.println(e.getMessage());
        }
    }
}
