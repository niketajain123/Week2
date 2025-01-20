//class AreaOfCircle
class AreaOfCircle{
    //private data member radius
    private int radius;
    //constructor
    public AreaOfCircle(int radius){
        this.radius=radius;
    }
    //method to calculate circumference
    public double calculateCircumference(){
        return 2*Math.PI*radius;
    }
    //method to calculate area
    public double calculateArea(){
        return Math.PI*Math.pow(radius,2);
    }
    //method to display area and circumference
    public void display(){
        System.out.println("Area of circle is "+calculateArea()+" and circumference of circle is "+calculateCircumference());
    }

}

//Main class
public class MainAreaOfCircle {
    public static void main(String[] args) {
        AreaOfCircle circle=new AreaOfCircle(10);
        circle.display();
    }
}
