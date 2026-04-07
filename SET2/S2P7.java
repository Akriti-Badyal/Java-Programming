class Message{
    String s;

    Message(String m){
        s=m;
    }

    void displayLen(){
        System.out.println("Length of the the String: " + s.length() );
    }
    void displayUpper(){
        System.out.println(" In Uppercase: "+ s.toUpperCase());
    }

}
public class S2P7 {
    public static void main(){
        Message m = new Message("Akriti");
        m.displayLen();
        m.displayUpper();
    }
    
}
