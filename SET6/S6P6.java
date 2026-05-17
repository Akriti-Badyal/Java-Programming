class Counter{
    public int count = 0;
    public void increment(){
        count++;
    }
}

public class S6P6{
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Thread t1 = new Thread(()->{
            for(int i = 0; i<1000;i++){
                c.increment();
            }
        });
        Thread t2 = new Thread(()->{
            for(int i = 0; i<1000;i++){
                c.increment();
            }
        });

        t1.start();
        System.out.println("Value of Counter "+ c.count);
        t1.join();
        System.out.println("Value of Counter "+ c.count);
        t2.start();
        System.out.println("Value of Counter "+ c.count);
        t2.join();

        System.out.println("Value of Counter "+ c.count);
    }
}