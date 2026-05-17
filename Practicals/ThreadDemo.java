import java.util.Scanner;

class MyThread extends Thread {

    int num;

    MyThread(int n) {
        num = n;
    }

    public void run() {

        System.out.println("Thread is running");
        System.out.println("Number = " + num);
    }
}

class ThreadDemo {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        MyThread t1 = new MyThread(n);

        t1.start();
    }
}

89