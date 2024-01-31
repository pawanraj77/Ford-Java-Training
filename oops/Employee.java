package oops;

public class Employee {

    //data members
    private Integer id;
    private String name;
    private Double salary;
    private String company;

    //constructor
    public Employee() {
        this.company = "Ford";
    }

    public Employee(Integer id, String name, Double salary, String company)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.company = company;
    }


}
