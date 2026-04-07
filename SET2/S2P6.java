class Car {
    String brand;
    int price;

    Car(String b, int p) {
        brand = b;
        price = p;

    }

    Car() {
        this("Unkknown", 0);
    }

    void display() {
        System.out.println("Brand: " + brand + "Price: " + price);
    }

}

public class S2P6 {
    public static void main(){
    Car c = new Car();
    Car b = new Car("toyota", 12000000);
    c.display();
    b.display();
}


}
