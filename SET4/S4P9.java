class Order{
    private double price;

    Order(double p){
        price = p;
    }
    void display(){
        System.out.println("Price of the order is "+ price);
    }

    public void applyDiscount(double d){
        if(d<50){
            price = price-(price*(d/100)); 
        }

        try{
            if(d>50){
                throw new Exception("Very High Discount");
            }
        }

        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
}
public class S4P9 {

    public static void main(String[] args) {
        Order o = new Order(10000);
        o.display();
        o.applyDiscount(7);
        o.display();

    }
    
}
