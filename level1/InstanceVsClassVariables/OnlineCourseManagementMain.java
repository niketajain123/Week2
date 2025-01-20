//class OnlineCourseManagement
class OnlineCourseManagement{
    //private instance variables
    private String courseName;
    private int duration;
    private int fee;
    //private class variables
    private static String instituteName="TIT group";
    //parameterized constructor
    public OnlineCourseManagement(String courseName,int duration, int fee){
        this.courseName=courseName;
        this.duration=duration;
        this.fee=fee;
    }
    //method to display
    public void displayDetails(){
        System.out.println("Course name : "+courseName);
        System.out.println("Duration : "+duration);
        System.out.println("Fee : "+fee);
        System.out.println("Institute name : "+instituteName);
    }
    //static method to update institute name
    public static void updateInstituteName(){
        instituteName="Technocrats group";
    }
}
//main class
public class OnlineCourseManagementMain {
    public static void main(String[] args) {
        //object creation
        OnlineCourseManagement course1=new OnlineCourseManagement("B.Tech",4,120000);
        OnlineCourseManagement course2=new OnlineCourseManagement("B.Sc.",3,60000);
        //displaying details
        course1.displayDetails();
        course2.displayDetails();
        //updating institute name
        OnlineCourseManagement.updateInstituteName();
        course1.displayDetails();
        course2.displayDetails();
        OnlineCourseManagement course3=new OnlineCourseManagement("MBA",2,80000);
        course3.displayDetails();
        course1.displayDetails();
    }
}
