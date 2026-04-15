import java.util.Scanner;
public class S5P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter the number:");
            String input = sc.nextLine();
            int num = Integer.parseInt(input);
            System.out.println("Entered number is: "+num);
        }

        catch(NumberFormatException e){
            System.out.println("Error ocurred you entered non numeric datatype. ");

        }

    }
    
}
