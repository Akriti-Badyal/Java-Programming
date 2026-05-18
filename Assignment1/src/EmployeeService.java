import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import java.io.*;

public class EmployeeService {

    ArrayList<Employee> employees = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    String fileName = "employees.txt";

    // Constructor
    public EmployeeService() {

        loadFromFile();
    }

    // ADD EMPLOYEE
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

        Employee emp = new Employee(id, name, department, salary);

        employees.add(emp);

        saveToFile();

        System.out.println("Employee Added Successfully!");
    }

    // VIEW EMPLOYEES
    public void viewEmployees() {

        if (employees.isEmpty()) {

            System.out.println("No Employees Found!");
            return;
        }

        System.out.println("\n===== EMPLOYEE RECORDS =====");

        for (Employee emp : employees) {

            System.out.println(emp);
        }
    }

    // UPDATE EMPLOYEE
    public void updateEmployee() {

        System.out.print("Enter Employee ID to Update: ");

        int id = sc.nextInt();
        sc.nextLine();

        for (Employee emp : employees) {

            if (emp.getId() == id) {

                System.out.print("Enter New Name: ");
                String name = sc.nextLine();

                System.out.print("Enter New Department: ");
                String dept = sc.nextLine();

                System.out.print("Enter New Salary: ");
                double salary = sc.nextDouble();

                emp.setName(name);
                emp.setDepartment(dept);
                emp.setSalary(salary);

                saveToFile();

                System.out.println("Employee Updated Successfully!");

                return;
            }
        }

        System.out.println("Employee Not Found!");
    }

    // DELETE EMPLOYEE
    public void deleteEmployee() {

        System.out.print("Enter Employee ID to Delete: ");

        int id = sc.nextInt();

        for (Employee emp : employees) {

            if (emp.getId() == id) {

                employees.remove(emp);

                saveToFile();

                System.out.println("Employee Deleted Successfully!");

                return;
            }
        }

        System.out.println("Employee Not Found!");
    }

    // SEARCH EMPLOYEE
    public void searchEmployee() {

        System.out.print("Enter Employee ID to Search: ");

        int id = sc.nextInt();

        for (Employee emp : employees) {

            if (emp.getId() == id) {

                System.out.println("\nEmployee Found:");
                System.out.println(emp);

                return;
            }
        }

        System.out.println("Employee Not Found!");
    }

    // SORT EMPLOYEES
    public void sortEmployees() {

        Collections.sort(employees,
                Comparator.comparing(Employee::getName));

        System.out.println("Employees Sorted by Name!");
    }

    // SAVE DATA TO FILE
    public void saveToFile() {

        try {

            FileWriter fw = new FileWriter(fileName);

            for (Employee emp : employees) {

                fw.write(
                        emp.getId() + "," +
                        emp.getName() + "," +
                        emp.getDepartment() + "," +
                        emp.getSalary() + "\n");
            }

            fw.close();

        } catch (Exception e) {

            System.out.println("Error Saving File!");
        }
    }

    // LOAD DATA FROM FILE
    public void loadFromFile() {

        try {

            File file = new File(fileName);

            if (!file.exists()) {

                return;
            }

            BufferedReader br =
                    new BufferedReader(new FileReader(file));

            String line;

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);

                String name = data[1];

                String department = data[2];

                double salary =
                        Double.parseDouble(data[3]);

                Employee emp =
                        new Employee(id, name,
                                department, salary);

                employees.add(emp);
            }

            br.close();

        } catch (Exception e) {

            System.out.println("Error Loading File!");
        }
    }
}