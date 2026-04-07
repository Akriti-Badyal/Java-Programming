class Employee {
    String name;
    String designation;
    int salary;

    Employee(String n, String d, int s) {
        name = n;
        designation = d;
        salary = s;

    }
    void display(){
        System.out.println("Name: "+name+"\nDesignation: "+designation+"\nSalary: "+salary);
    }

}

public class S2P3 {
    public static void main(){
        Employee e=new Employee("Akriti", "Manager", 1000000);
        e.display();

    }

}
