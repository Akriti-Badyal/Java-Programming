import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EmployeeGUI extends JFrame implements ActionListener {

    // Labels
    JLabel titleLabel;
    JLabel idLabel;
    JLabel nameLabel;
    JLabel deptLabel;
    JLabel salaryLabel;
    JLabel searchLabel;

    // Text Fields
    JTextField idField;
    JTextField nameField;
    JTextField deptField;
    JTextField salaryField;
    JTextField searchField;

    // Buttons
    JButton addButton;
    JButton viewButton;
    JButton updateButton;
    JButton deleteButton;
    JButton clearButton;
    JButton searchButton;
    JButton sortButton;

    // Text Area
    JTextArea displayArea;

    // Service Object
    EmployeeService service = new EmployeeService();

    // Constructor
    EmployeeGUI() {

        setTitle("Employee Management System");

        setSize(750, 650);

        setLayout(null);

        getContentPane().setBackground(new Color(240, 248, 255));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Title
        titleLabel = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        titleLabel.setBounds(180, 10, 400, 40);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        add(titleLabel);

        // Labels
        idLabel = new JLabel("Employee ID:");
        idLabel.setBounds(50, 80, 100, 30);
        add(idLabel);

        nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50, 130, 100, 30);
        add(nameLabel);

        deptLabel = new JLabel("Department:");
        deptLabel.setBounds(50, 180, 100, 30);
        add(deptLabel);

        salaryLabel = new JLabel("Salary:");
        salaryLabel.setBounds(50, 230, 100, 30);
        add(salaryLabel);

        // Text Fields
        idField = new JTextField();
        idField.setBounds(180, 80, 200, 30);
        add(idField);

        nameField = new JTextField();
        nameField.setBounds(180, 130, 200, 30);
        add(nameField);

        deptField = new JTextField();
        deptField.setBounds(180, 180, 200, 30);
        add(deptField);

        salaryField = new JTextField();
        salaryField.setBounds(180, 230, 200, 30);
        add(salaryField);

        // Buttons
        addButton = new JButton("Add");
        addButton.setBounds(450, 80, 120, 35);
        add(addButton);

        viewButton = new JButton("View");
        viewButton.setBounds(590, 80, 120, 35);
        add(viewButton);

        updateButton = new JButton("Update");
        updateButton.setBounds(450, 130, 120, 35);
        add(updateButton);

        deleteButton = new JButton("Delete");
        deleteButton.setBounds(590, 130, 120, 35);
        add(deleteButton);

        clearButton = new JButton("Clear");
        clearButton.setBounds(450, 180, 120, 35);
        add(clearButton);

        sortButton = new JButton("Sort");
        sortButton.setBounds(590, 180, 120, 35);
        add(sortButton);

        // Search
        searchLabel = new JLabel("Search ID:");
        searchLabel.setBounds(50, 300, 100, 30);
        add(searchLabel);

        searchField = new JTextField();
        searchField.setBounds(180, 300, 200, 30);
        add(searchField);

        searchButton = new JButton("Search");
        searchButton.setBounds(450, 300, 120, 35);
        add(searchButton);

        // Display Area
        displayArea = new JTextArea();
        displayArea.setFont(new Font("Monospaced", Font.PLAIN, 14));

        JScrollPane scrollPane =
                new JScrollPane(displayArea);

        scrollPane.setBounds(50, 370, 660, 200);

        add(scrollPane);

        // Action Listeners
        addButton.addActionListener(this);
        viewButton.addActionListener(this);
        updateButton.addActionListener(this);
        deleteButton.addActionListener(this);
        clearButton.addActionListener(this);
        searchButton.addActionListener(this);
        sortButton.addActionListener(this);

        setVisible(true);
    }

    // DISPLAY METHOD
    public void displayEmployees() {

        displayArea.setText("");

        for (Employee emp : service.getEmployees()) {

            displayArea.append(emp.toString() + "\n");
        }
    }

    // ACTION EVENTS
    @Override
    public void actionPerformed(ActionEvent e) {

        // ADD
        if (e.getSource() == addButton) {

            try {

                if (idField.getText().isEmpty() ||
                        nameField.getText().isEmpty() ||
                        deptField.getText().isEmpty() ||
                        salaryField.getText().isEmpty()) {

                    JOptionPane.showMessageDialog(this,
                            "Please Fill All Fields!");

                    return;
                }

                int id = Integer.parseInt(idField.getText());
                String name = nameField.getText();
                String dept = deptField.getText();
                double salary =
                        Double.parseDouble(salaryField.getText());

                Employee emp =
                        new Employee(id, name, dept, salary);

                service.addEmployee(emp);

                JOptionPane.showMessageDialog(this,
                        "Employee Added Successfully!");

                displayEmployees();

            } catch (Exception ex) {

                JOptionPane.showMessageDialog(this,
                        "Invalid Input!");
            }
        }

        // VIEW
        if (e.getSource() == viewButton) {

            displayEmployees();
        }

        // UPDATE
        if (e.getSource() == updateButton) {

            try {

                int id = Integer.parseInt(idField.getText());
                String name = nameField.getText();
                String dept = deptField.getText();
                double salary =
                        Double.parseDouble(salaryField.getText());

                boolean updated =
                        service.updateEmployee(id,
                                name,
                                dept,
                                salary);

                if (updated) {

                    JOptionPane.showMessageDialog(this,
                            "Employee Updated Successfully!");

                    displayEmployees();

                } else {

                    JOptionPane.showMessageDialog(this,
                            "Employee Not Found!");
                }

            } catch (Exception ex) {

                JOptionPane.showMessageDialog(this,
                        "Invalid Input!");
            }
        }

        // DELETE
        if (e.getSource() == deleteButton) {

            try {

                int id = Integer.parseInt(idField.getText());

                boolean deleted =
                        service.deleteEmployee(id);

                if (deleted) {

                    JOptionPane.showMessageDialog(this,
                            "Employee Deleted Successfully!");

                    displayEmployees();

                } else {

                    JOptionPane.showMessageDialog(this,
                            "Employee Not Found!");
                }

            } catch (Exception ex) {

                JOptionPane.showMessageDialog(this,
                        "Invalid Input!");
            }
        }

        // SEARCH
        if (e.getSource() == searchButton) {

            try {

                int id =
                        Integer.parseInt(searchField.getText());

                Employee emp =
                        service.searchEmployee(id);

                if (emp != null) {

                    displayArea.setText(emp.toString());

                } else {

                    JOptionPane.showMessageDialog(this,
                            "Employee Not Found!");
                }

            } catch (Exception ex) {

                JOptionPane.showMessageDialog(this,
                        "Invalid Input!");
            }
        }

        // SORT
        if (e.getSource() == sortButton) {

            service.sortEmployees();

            displayEmployees();

            JOptionPane.showMessageDialog(this,
                    "Employees Sorted Successfully!");
        }

        // CLEAR
        if (e.getSource() == clearButton) {

            idField.setText("");
            nameField.setText("");
            deptField.setText("");
            salaryField.setText("");
            searchField.setText("");
            displayArea.setText("");
        }
    }

    // MAIN METHOD
    public static void main(String[] args) {

        new EmployeeGUI();
    }
}