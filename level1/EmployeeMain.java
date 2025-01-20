//Employee class
class Employee{
    //private data members name, id, salary
    private String name;
    private int id;
    private double salary;
    //constructor
    public Employee(String name,int id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    //method to display details
    public void displayDetails(){
        System.out.println("Employee name is "+name+" with id "+id+" and salary is "+salary);
    }
}
//Main class
public class EmployeeMain {
    public static void main(String[] args) {
        //object creation
        Employee employee1=new Employee("ABC",01,50000);
        Employee employee2=new Employee("XYZ",02,55000);
        //displaying details
        employee1.displayDetails();
        employee2.displayDetails();
    }
}
