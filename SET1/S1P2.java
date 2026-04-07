
import java.util.ArrayList;



public class S1P2 {
    public static void main(String[] args) {
        
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(7);
        numbers.add(5);
        numbers.add(8);
        numbers.add(2);
        numbers.add(4);
        numbers.add(3);

        numbers.removeIf(n -> n == 2);


        System.out.println(numbers);


    }

}
