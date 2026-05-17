import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeService {

    ArrayList<Employee> employees = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    // CREATE
    public void addEmployee() {

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        Employee employee = new Employee(id, name, department, salary);

        employees.add(employee);

        System.out.println("Employee Added Successfully!");
    }

    // READ
    public void viewEmployees() {

        if (employees.isEmpty()) {
            System.out.println("No Employees Found!");
            return;
        }

        System.out.println("\n===== EMPLOYEE RECORDS =====");

        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    // UPDATE
    public void updateEmployee() {

        System.out.print("Enter Employee ID to Update: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Employee e : employees) {

            if (e.getId() == id) {

                System.out.print("Enter New Name: ");
                String name = sc.nextLine();

                System.out.print("Enter New Department: ");
                String department = sc.nextLine();

                System.out.print("Enter New Salary: ");
                double salary = sc.nextDouble();

                e.setName(name);
                e.setDepartment(department);
                e.setSalary(salary);

                System.out.println("Employee Updated Successfully!");

                return;
            }
        }

        System.out.println("Employee Not Found!");
    }

    // DELETE
    public void deleteEmployee() {

        System.out.print("Enter Employee ID to Delete: ");
        int id = sc.nextInt();

        for (Employee e : employees) {

            if (e.getId() == id) {

                employees.remove(e);

                System.out.println("Employee Deleted Successfully!");

                return;
            }
        }

        System.out.println("Employee Not Found!");
    }
}