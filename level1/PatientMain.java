class Patient{
    private static String hospitalName="ABC Hospital";
    private static int count;
    private String name;
    private int age;
    private String ailment;
    private final int patientId;
    public Patient(String name,int patientId,String ailment,int age){
        this.name=name;
        this.patientId=patientId;
        this.ailment=ailment;
        this.age=age;
        count++;
    }
    public void display(){
        System.out.println("Patient's name : "+name);
        System.out.println("Patient's ID : "+patientId);
        System.out.println("Patient's age : "+age);
        System.out.println("Patient's ailment : "+ailment);
        System.out.println("Hospital name : "+hospitalName);
    }
    public static void getTotalPatient(){
        System.out.println("Total number of patients in hospital : "+count);
    }

}
public class PatientMain {
    public static void main(String[] args) {
        Patient patient1=new Patient("abc",01,"A",55);
        Patient patient2=new Patient("xyz",02,"X",60);
        if(patient1 instanceof Patient){
            System.out.println("Patient1 : ");
            patient1.display();
        }
        if(patient2 instanceof Patient){
            System.out.println("Patient2 : ");
            patient2.display();
        }
        Patient.getTotalPatient();
    }
}
