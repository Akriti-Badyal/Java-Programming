import java.util.Scanner;
public class S5P1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter the numerator:");
            int n = sc.nextInt();
            System.out.println("Enter the denominator:");

            int d = sc.nextInt();
            float result = n/d;
            System.out.println("Result is :"+result);


        }

        catch(ArithmeticException e){
            System.out.println("Error occured: " +e.getMessage());
        }

        sc.close();
    }
    
}
