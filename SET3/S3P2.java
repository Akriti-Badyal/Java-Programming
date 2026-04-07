class Employee {
    String name;
    int baseSalary;

    Employee(String n, int s) {
        name = n;
        baseSalary = s;
    }
    void display(){
        System.out.println(name + baseSalary);
    }

}

class Manager extends Employee {
    double bonus;

    Manager(String n, int s, double b) {
        super(n, s);
        bonus = b;

    }

    void display() {
        super.display();
        System.out.println(bonus);
    }

    void totalSal() {
        System.out.println("TOTAL SALARY:" + (bonus + super.baseSalary));
    }
}

public class S3P2 {
    public static void main(String[] args) {
        Manager m = new Manager("abc", 100000, 12000);
        

    }

}
