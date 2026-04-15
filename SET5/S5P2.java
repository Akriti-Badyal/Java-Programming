public class S5P2{
    public static void main(String[] args) {
        int[] arr = { 1,4,3,6,4,4,4,3};

        try{
            System.out.println(arr[9]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of range error occurred.");
        }
    }
    
}
