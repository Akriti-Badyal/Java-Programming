import java.util.Scanner;

public class S5P7 {
    static void checkAge(int age){
        try{

            if(age<18){
                throw new Exception("InvalidAgeException");
            }
        }

        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age: ");
        int age = sc.nextInt();
        checkAge(age);

    }
}
