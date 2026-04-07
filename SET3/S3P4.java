class Product {
    String name;
    int price;

    Product(String n, int p) {
        name = n;
        price = p;
    }

    void display(){
        System.out.println("name:"+name);
        System.out.println("price:"+price);
    }

}

class Electronic extends Product {
    String warranty;

    Electronic(String n, int p, String w) {
        super(n, p);
        warranty = w;

    }
    void display(){
        super.display();
        System.out.println("warranty:"+warranty);

    }

  
}

public class S3P4 {
    public static void main(String[] args) {

        Electronic E = new Electronic("AC", 10000, "4YRS");
        E.display();
        
    }

}
