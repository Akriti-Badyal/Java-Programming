class Mythread extends Thread {
    private String threadName;

    Mythread(String name) {
        threadName = name;
    }

    public void run(){
        for(int i=0;i<10;i++ ){
            System.out.println("Thread Name:"+threadName+"Count:"+(i+1));
            try{
                System.out.println("Before Sleep: "+ threadName);
            Thread.sleep(1000);
            System.out.println("After Sleep: "+ threadName);
            }
            catch(InterruptedException e){
                System.out.println(getName());
            }
        }
    }

}

public class S6P3 {
    public static void main(String[] args) {
        Mythread t1 = new Mythread("thread1");
        

        t1.start();



    }
}
