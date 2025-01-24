import java.util.ArrayList;

class Student{
    private String name;
    private ArrayList<Subject> subjects;//aggregation
    private String grade;
    public Student(String name){
        this.name=name;
        subjects=new ArrayList<>();
        System.out.println("Student : "+name+" added!");
    }
    public void addSubject(Subject subject){
        subjects.add(subject);
        System.out.println("Subject "+subject.getName()+" added");
    }
    public String getName(){
        return name;
    }
    public ArrayList<Subject> getSubjects(){
        return subjects;
    }
    public void display(){
        System.out.println("Student's name  : "+name);
        System.out.println("Subjects and marks : ");
        for(Subject subject:subjects){
            System.out.println("Subject "+subject.getName()+" marks "+subject.getMarks());
        }
        System.out.println("Grade is "+grade);
    }
//    public String getGrade(){
//        return grade;
//    }
    public void computeGrade(){
        GradeCalculator gc=new GradeCalculator();
        String g=gc.calculateGrade(this);//dependency
        grade=g;
    }

}
class Subject{
    private String name;
    private int marks;
    public Subject(String name, int marks){
        this.name=name;
        this.marks=marks;
    }
    public String getName(){
        return name;
    }
    public int getMarks(){
        return marks;
    }

}
class GradeCalculator {
    private int totalMarks;
    private int average;
    private String grade;

    public String calculateGrade(Student student) {
        ArrayList<Subject> subjects = student.getSubjects();
        for (Subject subject : subjects) {
            totalMarks += subject.getMarks();
        }
        average = totalMarks / subjects.size();
        if (average >= 85)
            grade = "A";
        else if (average >= 70 && average < 85)
            grade = "B";
        else if (average >= 60 && average < 70)
            grade = "C";
        else if (average >= 50 && average < 60)
            grade = "D";
        else if (average >= 35 && average < 50)
            grade = "E";
        else
            grade = "R";
        return grade;
    }
}
public class StudentResultApplication {
    public static void main(String[] args) {
        Subject subject1=new Subject("Math",90);
        Subject subject2=new Subject("Science",85);
        Student student1=new Student("John");
        student1.addSubject(subject1);
        student1.addSubject(subject2);
        student1.computeGrade();
        student1.display();
    }

}
