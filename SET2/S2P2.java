class Rectangle{
    int length;
    int width;

    Rectangle(int l, int w){
        length =l;
        width = w;
    }
    void displayArea(){
        System.out.println("Area is "+ (length*width));

    }
}

public class S2P2 {
    public static void main(){
        Rectangle r1 = new Rectangle(4,7);
        r1.displayArea();
    }

    
}
