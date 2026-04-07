class Vehicle{
    int vehicleno;
    String ownername;
    Vehicle(int v, String o){
        System.out.println("Vehicle constructor");
        vehicleno = v;
        ownername = o;

    }

}

class Car extends Vehicle{
    String model;
    String fueltype;


    Car(int v, String o, String m, String f){
        System.out.println("Car Constructor");
        super(v,o);
        model = m;
        fueltype =f;

    }
}

public class S3P3 {
    public static void main(String[] args) {
        Car V = new Car(123,"gfr","frf","rew");

    }
    
}
