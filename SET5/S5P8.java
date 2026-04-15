import java.util.*;
class BankAccount{
    double balance;

    BankAccount(double b){
        balance = b;
    }

    public double getBalance(){
        return balance;
    }

    public void withdraw(double amount){
        balance =- balance - amount;
    }
}
public class S5P8 {

    public static void main(String[] args) {

        System.out.println("enter amount to be withdrawn: ");
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();

        BankAccount b = new BankAccount(100000); 

        try{
            if(amount>b.getBalance()){
                throw new Exception("LessBalanceException");
            }
            else{
                b.withdraw(amount);

            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }



   
  
    
}
