package oops;

public class Client {
    public static void main(String[] args)
    {
        Integer num=100;
        Employee employee;
        employee = new Employee();
        System.out.println(employee.toString());

        Employee employeeOne = new Employee(1, "Sreenath", 2500.0, "Ford");
        System.out.println(employeeOne);

        Calculator calculator = new Calculator();
        calculator.display();
        calculator.display(100);


    }
}
