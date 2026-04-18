package com.company.employee;

class Employee {
    int id;
    String name;
    String department;
    double salary;

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    void displayEmployee() {
        System.out.println("Employee ID      : " + id);
        System.out.println("Employee Name    : " + name);
        System.out.println("Department       : " + department);
        System.out.println("Salary           : " + salary);
        System.out.println("-----------------------------------");
    }
}

public class App {
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "Malik", "DevOps", 55000);
        Employee emp2 = new Employee(102, "Rahul", "Cloud", 60000);

        System.out.println("Employee Management Application");
        System.out.println("================================");

        emp1.displayEmployee();
        emp2.displayEmployee();
    }
}
