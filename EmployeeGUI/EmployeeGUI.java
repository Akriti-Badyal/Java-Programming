import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class EmployeeGUI extends JFrame implements ActionListener {

    // Labels
    JLabel idLabel, nameLabel, deptLabel, salaryLabel;

    // Text Fields
    JTextField idField, nameField, deptField, salaryField;

    // Buttons
    JButton addButton, viewButton, updateButton, deleteButton, clearButton;

    // Text Area
    JTextArea displayArea;

    // Employee List
    ArrayList<Employee> employees = new ArrayList<>();

    // Constructor
    EmployeeGUI() {

        setTitle("Employee Management System");

        setSize(600, 500);

        setLayout(null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Labels
        idLabel = new JLabel("Employee ID:");
        idLabel.setBounds(50, 30, 100, 30);
        add(idLabel);

        nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50, 70, 100, 30);
        add(nameLabel);

        deptLabel = new JLabel("Department:");
        deptLabel.setBounds(50, 110, 100, 30);
        add(deptLabel);

        salaryLabel = new JLabel("Salary:");
        salaryLabel.setBounds(50, 150, 100, 30);
        add(salaryLabel);

        // Text Fields
        idField = new JTextField();
        idField.setBounds(170, 30, 150, 30);
        add(idField);

        nameField = new JTextField();
        nameField.setBounds(170, 70, 150, 30);
        add(nameField);

        deptField = new JTextField();
        deptField.setBounds(170, 110, 150, 30);
        add(deptField);

        salaryField = new JTextField();
        salaryField.setBounds(170, 150, 150, 30);
        add(salaryField);

        // Buttons
        addButton = new JButton("Add");
        addButton.setBounds(50, 210, 100, 30);
        add(addButton);

        viewButton = new JButton("View");
        viewButton.setBounds(170, 210, 100, 30);
        add(viewButton);

        updateButton = new JButton("Update");
        updateButton.setBounds(290, 210, 100, 30);
        add(updateButton);

        deleteButton = new JButton("Delete");
        deleteButton.setBounds(410, 210, 100, 30);
        add(deleteButton);

        clearButton = new JButton("Clear");
        clearButton.setBounds(230, 260, 100, 30);
        add(clearButton);

        // Text Area
        displayArea = new JTextArea();

        JScrollPane scrollPane = new JScrollPane(displayArea);

        scrollPane.setBounds(50, 320, 500, 120);

        add(scrollPane);

        // Action Listeners
        addButton.addActionListener(this);
        viewButton.addActionListener(this);
        updateButton.addActionListener(this);
        deleteButton.addActionListener(this);
        clearButton.addActionListener(this);

        setVisible(true);
    }

    // Actions
    public void actionPerformed(ActionEvent e) {

        // ADD
        if (e.getSource() == addButton) {

            int id = Integer.parseInt(idField.getText());

            String name = nameField.getText();

            String dept = deptField.getText();

            double salary = Double.parseDouble(salaryField.getText());

            Employee emp = new Employee(id, name, dept, salary);

            employees.add(emp);

            JOptionPane.showMessageDialog(this,
                    "Employee Added Successfully!");
        }

        // VIEW
        if (e.getSource() == viewButton) {

            displayArea.setText("");

            for (Employee emp : employees) {

                displayArea.append(emp.toString() + "\n");
            }
        }

        // UPDATE
        if (e.getSource() == updateButton) {

            int id = Integer.parseInt(idField.getText());

            for (Employee emp : employees) {

                if (emp.getId() == id) {

                    emp.setName(nameField.getText());

                    emp.setDepartment(deptField.getText());

                    emp.setSalary(
                            Double.parseDouble(salaryField.getText()));

                    JOptionPane.showMessageDialog(this,
                            "Employee Updated Successfully!");

                    return;
                }
            }

            JOptionPane.showMessageDialog(this,
                    "Employee Not Found!");
        }

        // DELETE
        if (e.getSource() == deleteButton) {

            int id = Integer.parseInt(idField.getText());

            for (Employee emp : employees) {

                if (emp.getId() == id) {

                    employees.remove(emp);

                    JOptionPane.showMessageDialog(this,
                            "Employee Deleted Successfully!");

                    return;
                }
            }

            JOptionPane.showMessageDialog(this,
                    "Employee Not Found!");
        }

        // CLEAR
        if (e.getSource() == clearButton) {

            idField.setText("");

            nameField.setText("");

            deptField.setText("");

            salaryField.setText("");

            displayArea.setText("");
        }
    }

    // Main Method
    public static void main(String[] args) {

        new EmployeeGUI();
    }
}