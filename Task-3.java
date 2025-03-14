import java.util.ArrayList;
import java.util.List;

  class Employee {
    
    private int id;
    private String name;
    private double salary;

    
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    
    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: "+ salary);
        System.out.println("--------------------");
    }
 }


   public class EmployeeDemo {
    public static void main(String[] args) {
        
        Employee emp1 = new Employee(101, "Kumar", 30000);
        Employee emp2 = new Employee(102, "Naveen", 35000);
        Employee emp3 = new Employee(103, "Pranav", 55000);

        
        List<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        
        System.out.println("Employee Details:");
        System.out.println("--------------------");
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}
 