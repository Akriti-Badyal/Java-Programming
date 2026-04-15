import java.util.*;
import java.io.*;
public class S5P5 {
    public static void main(String[] args) {
        
        

        try{
            File file = new File("hello.txt");
            Scanner sc = new Scanner(file);

            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());

            }

        }

        catch(FileNotFoundException e){
            System.out.println("Exception occured: " + e.getMessage());
        }
    }
    
}
