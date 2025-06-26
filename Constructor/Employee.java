package Constructors;

public class Employee {
    public int employeeID;;
    protected String department;
    private int salary;

    public Employee(int employeeID, String department, int salary) {
        this.employeeID = employeeID;
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;

    }

    public static class Manager{
        private Employee employee;

        public Manager(Employee employee){
            this.employee = employee;
        }

        public void displayMangerDetails() {
            System.out.println("Employee ID: " + employee.employeeID);
            System.out.println("Department: " + employee.department);
            System.out.println("Salary: " + employee.salary);
        }
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Manager", 500);
        Manager manager1 = new Manager(employee1);
        employee1.setSalary(50000);
        manager1.displayMangerDetails();
    }
}
