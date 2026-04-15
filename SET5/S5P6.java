import java.util.Scanner;
public class S5P6{
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);

        try{
            System.out.println("Enter first number: ");
            String a = sc.nextLine();
            System.out.println("Enter second number: ");
            String b = sc.nextLine();

            int num1 = Integer.parseInt(a);
            int num2 = Integer.parseInt(b);

            int result = num1/num2;

            System.out.println("result after divison is: "+result);

            
        }

        catch(ArithmeticException e){
            System.out.println("Arithematic exception occured. ");
        }

        catch(NumberFormatException e){
            System.out.println("Number format exception occured. ");
        }

        catch( Exception e){
            System.out.println("An unknown error occured. ");
        }

        finally{
            System.out.println("all errors are handled ");
        }

    }
    
}
