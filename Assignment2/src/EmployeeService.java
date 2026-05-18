import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.io.*;

public class EmployeeService {

    ArrayList<Employee> employees = new ArrayList<>();

    String fileName = "employees.txt";

    // Constructor
    public EmployeeService() {

        loadFromFile();
    }

    // ADD EMPLOYEE
    public void addEmployee(Employee emp) {

        employees.add(emp);

        saveToFile();
    }

    // VIEW EMPLOYEES
    public ArrayList<Employee> getEmployees() {

        return employees;
    }

    // UPDATE EMPLOYEE
    public boolean updateEmployee(int id,
                                  String name,
                                  String department,
                                  double salary) {

        for (Employee emp : employees) {

            if (emp.getId() == id) {

                emp.setName(name);
                emp.setDepartment(department);
                emp.setSalary(salary);

                saveToFile();

                return true;
            }
        }

        return false;
    }

    // DELETE EMPLOYEE
    public boolean deleteEmployee(int id) {

        for (Employee emp : employees) {

            if (emp.getId() == id) {

                employees.remove(emp);

                saveToFile();

                return true;
            }
        }

        return false;
    }

    // SEARCH EMPLOYEE
    public Employee searchEmployee(int id) {

        for (Employee emp : employees) {

            if (emp.getId() == id) {

                return emp;
            }
        }

        return null;
    }

    // SORT EMPLOYEES
    public void sortEmployees() {

        Collections.sort(employees,
                Comparator.comparing(Employee::getName));
    }

    // SAVE FILE
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

    // LOAD FILE
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
                double salary = Double.parseDouble(data[3]);

                Employee emp =
                        new Employee(id,
                                name,
                                department,
                                salary);

                employees.add(emp);
            }

            br.close();

        } catch (Exception e) {

            System.out.println("Error Loading File!");
        }
    }
}