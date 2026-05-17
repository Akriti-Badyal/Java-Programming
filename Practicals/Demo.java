import java.util.Scanner;

interface A {
    void input();
}

interface B {
    void display();
}

class Demo implements A, B {

    int a, b;

    public void input() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        a = sc.nextInt();

        System.out.print("Enter second number: ");
        b = sc.nextInt();
    }

    public void display() {

        System.out.println("Addition = " + (a + b));
    }

    public static void main(String args[]) {

        Demo d = new Demo();

        d.input();

        d.display();
    }
}