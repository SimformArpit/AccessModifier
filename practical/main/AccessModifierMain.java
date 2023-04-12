package practical.main;

import practical.employee.Employee;

public class AccessModifierMain {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.name = "Arpit";
        System.out.println("Name of the Employee : " + employee1.name);

//      employee1.salary = 40000; 'salary' has private access in 'practical.employee.Employee'
        employee1.setSalary(40000);
        System.out.println("Salary : " + employee1.getSalary());

//      employee1.age = 21; 'age' has protected access in 'practical.employee.Employee'
        employee1.setAge(21);
        System.out.println("Age of the Employee  : " + employee1.getAge());
    }
}
