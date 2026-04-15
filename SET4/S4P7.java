import java.io.FileNotFoundException;
import java.io.FileReader;

public class S4P7 {

    public static void main(String[] args) {
        
        try{
            FileReader f = new FileReader("abc.txt");
            System.out.println(f);

        }
        catch(FileNotFoundException e){
            System.out.println("File was not found");
        }
        finally{
            System.out.println("file closing....");
        }
    }
    
}
