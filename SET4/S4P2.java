
class Bank{
    private int balance;
    Bank(int b){
        balance = b;

    }

    protected void withdraw(int b){
        if(balance>0){
            balance = balance -b;
        }
    }

    public void checkBalance(){
        System.out.println("Your Balance is  "+ balance);
    }
}
public class S4P2 {
    public static void main(String[] args) {
        Bank b = new Bank(900000);
        b.checkBalance();
        b.withdraw(10000);
        b.checkBalance();
    }
    
}
