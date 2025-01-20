class EmployeeRecords{
    public int employeeId;
    protected String department;
    private double salary;
    public EmployeeRecords(int employeeId,String department,double salary){
        this.employeeId=employeeId;
        this.department=department;
        this.salary=salary;
    }
    public void modifSalary(double salary){
        this.salary=salary;
    }
    public void display(){
        System.out.println("Employee ID : "+employeeId);
        System.out.println("Department : "+department);
        System.out.println("Salary : "+salary);
    }
}
class Manager extends EmployeeRecords{
    public Manager(int employeeId,String department, double salary){
        super(employeeId,department,salary);
    }
    public void displayEmployeeId(){
        System.out.println("Employee Id : "+employeeId);
    }
    public void displayDepartment(){
        System.out.println("Department : "+department);
    }
}
public class EmployeeRecordsMain {
    public static void main(String[] args) {
        EmployeeRecords employee1=new EmployeeRecords(1,"a",20000);
        employee1.display();
        System.out.println("After modifying : ");
        employee1.display();
        employee1.modifSalary(25000);
        Manager manager=new Manager(2,"b",30000);
        manager.displayDepartment();
        manager.displayEmployeeId();
    }
}
