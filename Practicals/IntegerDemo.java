import java.util.Scanner;

class IntegerDemo {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");

        String s = sc.nextLine();

        // Convert String to int using parseInt()
        int num = Integer.parseInt(s);

        System.out.println("String value: " + s);
        System.out.println("Integer value: " + num);
    }
}
