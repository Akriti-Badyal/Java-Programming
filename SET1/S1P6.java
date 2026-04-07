
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
public class S1P6 {
    public static void main(String[] args) {
        Integer[] arr = { 1, 2, 3, 4, 5, 6,34,32,64,234,2, 7, 8, 9 };
        List <Integer> li= Arrays.asList(arr);
         System.out.println("Original List is  "+li);
        Collections.reverse(li);
        System.out.println("Reversed List is "+li);
        

        

    }

}
