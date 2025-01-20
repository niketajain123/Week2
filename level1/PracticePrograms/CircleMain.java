//Circle class
class Circle{
    private int radius;
    //default constructor
    public Circle(){
        this(1);//constructor chaining
    }
    //parameterized constructor
    public Circle(int radius){
        this.radius=radius;
    }
    //displaying radius
    public void dispaly(){
        System.out.println("Radius of circle is "+radius);
    }

}
//main class
public class CircleMain {
    public static void main(String[] args) {
        //instantiation
        Circle circle1=new Circle();
        Circle circle2=new Circle(10);
        //displaying radius
        circle1.dispaly();
        circle2.dispaly();
    }
}
