class Student {
    private static String universityName="ABC University";
    private final int rollNumber;
    private String name;
    private char grade;
    private static int count;
    public Student(int rollNumber,String name,char grade){
        this.rollNumber=rollNumber;
        this.name=name;
        this.grade=grade;
        count++;
    }
    public void display(){
        System.out.println("Student's name : "+name);
        System.out.println("Student's roll number : "+rollNumber);
        System.out.println("Student's grade : "+grade);
        System.out.println("University name : "+universityName);
    }
    public static void displayTotalStudents(){
        System.out.println("Total number of students in university is "+count);
    }
}
public class StudentMain {
    public static void main(String[] args) {
        Student student1=new Student(1,"abc",'A');
        Student student2=new Student(2,"xyz",'B');
        if(student1 instanceof Student){
            System.out.println("Student1 : ");
            student1.display();
        }
        if(student2 instanceof Student){
            System.out.println("Student2 : ");
            student2.display();
        }
        Student.displayTotalStudents();
    }
}
