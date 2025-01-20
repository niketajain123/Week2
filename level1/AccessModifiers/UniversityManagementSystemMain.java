class UniversityManagementSystem {
    public int rollNumber;
    protected String name;
    private double cgpa;

    //default constructor
    public UniversityManagementSystem() {
    }

    //parameterized constructor
    public UniversityManagementSystem(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    //modifying cgpa
    public void updateCGPA(double cgpa) {
        this.cgpa = cgpa;
    }

    public void displayDetails() {
        System.out.println("Name : " + name + ", Roll number : " + rollNumber + ", CGPA : " + cgpa);
    }
}
class PostGraduateStudent extends UniversityManagementSystem{
       public PostGraduateStudent(int rollNumber,String name,double cgpa){
           super(rollNumber,name,cgpa);
       }
        // Method to access protected member
        public void changeName(String newName) {
            this.name = newName; // Accessing protected member from subclass
        }
    }

public class UniversityManagementSystemMain {
    public static void main(String[] args) {
        UniversityManagementSystem student1=new UniversityManagementSystem(1,"abc",8.8);
        System.out.println("Student1:");
        student1.displayDetails();
        student1.updateCGPA(8.9);
        System.out.println("Student1:\nAfter updating cgpa : ");
        student1.displayDetails();
        PostGraduateStudent student2=new PostGraduateStudent(2,"XYZ",8.5);
        System.out.println("Student2:");
        student2.displayDetails();
        student2.changeName("xyz");
        System.out.println("Student2:\nAfter updating name : ");
        student2.displayDetails();

    }
}
