//Person class
class Person{
    private String name;
    private String gender;
    private int age;
    //parameterized costructor
    public Person(String name,String gender,int age){
        this.name=name;
        this.gender=gender;
        this.age=age;
    }
    //copy constructor
    public Person(Person previousPerson){
        this.name=previousPerson.name;
        this.gender=previousPerson.gender;
        this.age= previousPerson.age;
    }
    //display
    public void display(){
        System.out.println("Name  :"+name);
        System.out.println("Gender : "+gender);
        System.out.println("Age : "+age);
    }
}
//main class
public class MainPerson {
    public static void main(String[] args) {
        //instantiation
        Person person1=new Person("ABC","M",20);
        Person person2=new Person("XYZ","F",25);
        Person person3=new Person(person2);
        //displaying output
        System.out.println("Person1 details : ");
        person1.display();
        System.out.println("Person2 details : ");
        person2.display();
        System.out.println("Person3(copy of person2) details : ");
        person3.display();
    }
}
