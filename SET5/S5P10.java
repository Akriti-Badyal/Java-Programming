import java.util.*;
class InvalidMarksExceptin extends Exception{
    public InvalidMarksExceptin(String message){
        super("Marks not valid ");
    }
}
public class S5P10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];

        System.out.println("Enter marks one by one ");

        for(int i = 0; i<5; i++){
            int m = sc.nextInt();
        try{
            if(m>100 || m<0){
                throw new InvalidMarksExceptin("Marks should be between 0 and 100");
            }
            else{
                marks[i]=m;
            }
        }

        catch(Exception e){
            System.out.println(e.getMessage());

        }
        }
        int sum =0;

        for(int i = 0; i<5; i++){
            sum+=marks[i];

        }
        int average = sum/5;


        System.out.println("Average is "+average);

    }
    
}
