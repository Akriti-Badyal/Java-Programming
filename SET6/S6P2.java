 class MyRunnable implements Runnable {
    private String threadName;
    MyRunnable(String name){
        threadName = name;
    }

    public void run(){
        for(int i=0;i<5;i++ ){
            System.out.println("Thread Name:"+threadName+" Count:"+(i+1));
        }
    }

    
}
public class S6P2{
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable("thread1"));
        

        t1.start();

        
        
    }
}
