class Mythread extends Thread {
    private String threadName;

    Mythread(String name) {
        threadName = name;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread Name:" + threadName + "Count:" + (i + 1) + "Priority: "+ getPriority());
            
        }
    }

    

}

public class S6P5{
    public static void main(String[] args) {
        Mythread t1 = new Mythread("thread1");
        Mythread t2 = new Mythread("thread2");
        Mythread t3 = new Mythread("thread3");

        t1.setPriority(4);
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);

        t3.start();
        t1.start();
        t2.start();

        

    }
}
