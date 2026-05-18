import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        EmployeeService service = new EmployeeService();

        int choice;

        do {

            System.out.println("\n===== EMPLOYEE MANAGEMENT SYSTEM =====");

            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Search Employee");
            System.out.println("6. Sort Employees");
            System.out.println("7. Exit");

            System.out.print("Enter Your Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    service.addEmployee();
                    break;

                case 2:
                    service.viewEmployees();
                    break;

                case 3:
                    service.updateEmployee();
                    break;

                case 4:
                    service.deleteEmployee();
                    break;

                case 5:
                    service.searchEmployee();
                    break;

                case 6:
                    service.sortEmployees();
                    break;

                case 7:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 7);

        sc.close();
    }
}