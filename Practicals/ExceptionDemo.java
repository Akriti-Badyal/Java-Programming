import java.util.Scanner;

class ExceptionDemo {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int a, b;

        System.out.print("Enter first number: ");
        a = sc.nextInt();

        System.out.print("Enter second number: ");
        b = sc.nextInt();

        try {

            int result = a / b;

            System.out.println("Result = " + result);
        }

        catch (ArithmeticException e) {

            System.out.println("Cannot divide by zero");
        }

        finally {

            System.out.println("Program Ended");
        }
    }
}