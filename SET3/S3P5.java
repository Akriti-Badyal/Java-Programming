class Account {
    int accno;
    int balance;

    Account(int a, int b) {
        accno = a;
        balance = b;
    }

    void display() {
        System.out.println("accountno:" + accno);
        System.out.println("balance:" + balance);
    }

}

class SavingAccount extends Account {
    int rate;

    SavingAccount(int n, int p, int r) {
        super(n, p);
        rate = r;;

    }

    void display() {
        super.display();
        System.out.println("Interest:"+(balance*rate)/100);

    }

}

public class S3P5 {
    public static void main(String[] args) {

        SavingAccount E = new SavingAccount(676767, 10000, 4);
        E.display();

    }

}
