import java.util.*;
class InvalidPasswordException extends Exception{

    public InvalidPasswordException(String message){
        super(message);
    }

}
public class S5P9 {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);   
        
        try{
            System.out.println("Enter Password: ");
            String password = sc.nextLine();

            boolean digit = false;
            for(int i = 0; i< password.length();i++){
            if(Character.isDigit(password.charAt(i))){
                digit = true;

            }

            }

            if(digit = false){
                throw new InvalidPasswordException("Digit Missing ");
            }
            else{
                System.out.println("password valid ");
            }
            if(password.length()!=8){
                throw new InvalidPasswordException("Length not equal to 8 ");
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
