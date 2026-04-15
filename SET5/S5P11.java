import java.util.*;
public class S5P11 {
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b =  sc.nextInt();

        try{
            if(a<b){
                throw new Exception("smallerNumeratorException");
                try{
                    if(a<0 || b<0){
                        throw new Exception("NegativeNumberException");

                    }
                }
                catch(Exception e){
                    
                }
            }

        }

    }
    
}
