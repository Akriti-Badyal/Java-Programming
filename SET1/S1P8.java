
import java.util.List;
import java.util.Arrays;
import java.util.HashMap;

public class S1P8 {
    public static void main(String[] args) {
        String[] words = { "apple", "banana", "pineapple", "oranges", "apple" };
        List<String> arr = Arrays.asList(words);
        System.out.println(arr);


        HashMap<String, Integer> Map = new HashMap<>();


        for (String x : arr) {
            if (Map.containsKey(x)) {
                Map.put(x, Map.get(x) + 1);
            } else {
                Map.put(x, 1);
            }
        }
        

        for (String key : Map.keySet()) {
            System.out.println(key + ":" + Map.get(key));
        }
    }
}
