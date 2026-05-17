 class Mythread extends Thread {
    private String threadName;
    Mythread(String name){
        threadName = name;
    }

    public void run(){
        for(int i=0;i<5;i++ ){
            System.out.println("Thread Name:"+threadName+"Count:"+(i+1));
        }
    }

    
}
public class S6P1{
    public static void main(String[] args) {
        Mythread t1 = new Mythread("thread1");
        Mythread t2 = new Mythread("thread2");

        t1.start();

        t2.start();
        
    }
}
