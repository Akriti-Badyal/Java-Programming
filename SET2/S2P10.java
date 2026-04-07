

class Sentence{
    String line;

    Sentence(){
        line =" ";
    }
    Sentence(String l){
        line = l;
    
    }
    void count(){
        System.out.println("Words are :" + line.split(" ").length);
    }
}
public class S2P10 {
    public static void main(){
        Sentence s1 = new Sentence();
        Sentence s2 = new Sentence("MAh name is akriti");
       
        s1.count();

   
        s2.count();

    }
    
}
