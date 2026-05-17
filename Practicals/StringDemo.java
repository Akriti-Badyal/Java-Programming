import java.util.Scanner;

class StringDemo {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Length = " + str.length());

        System.out.println("Uppercase = " + str.toUpperCase());

        System.out.println("Lowercase = " + str.toLowerCase());

        System.out.println("Character at index 0 = " + str.charAt(0));
    }
}