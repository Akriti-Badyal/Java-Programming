
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
public class S1P7 {
    public static void main(String[] args) {
        Integer[] arr = { 1, 2, 3, 4, 5, 6,34,32,64,234,2, 7, 8, 9 };
        List <Integer> li= Arrays.asList(arr);
         Collections.sort(li);
         System.out.println("Ascending Order : "+li);
         Collections.sort(li, Collections.reverseOrder());
         System.out.println("Descending Order : "+li);

        

        

    }

}
