class Employee{
    private static String companyName="ABC Company";
    private static int count;
    private String name;
    private final int id;
    private String designation;
    public Employee(String name,int id,String designation){
        this.name=name;
        this.id=id;
        this.designation=designation;
        count++;
    }
    public void display(){
        System.out.println("Company Name : "+companyName);
        System.out.println("Employee Name : "+name);
        System.out.println("ID : "+id);
        System.out.println("Designation : "+designation);
    }
    public static void displayTotalEmployees(){
        System.out.println("Total number of employees : "+count);
    }
}
public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee1=new Employee("abc",1,"Manager");
        Employee employee2=new Employee("xyz",2,"HR");
        if(employee1 instanceof Employee){
            System.out.println("Employee1:");
            employee1.display();
        }
        if(employee2 instanceof Employee){
            System.out.println("Employee2:");
            employee2.display();
        }
        Employee.displayTotalEmployees();

    }
}
