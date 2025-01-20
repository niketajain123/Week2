//class HotelBooking
class HotelBooking{
    //private members
    private String guestName;
    private String roomType;
    private int nights;
    //default constructor
    public HotelBooking(){
        guestName="Unkown";
        roomType="Unknown";
        nights=1;
    }
    //parameterized constructor
    public HotelBooking(String guestName,String roomType,int nights){
        this.guestName=guestName;
        this.roomType=roomType;
        this.nights=nights;
    }
    //copy contructor
    public HotelBooking(HotelBooking previousRoom){
        this.guestName=previousRoom.guestName;
        this.roomType= previousRoom.roomType;
        this.nights= previousRoom.nights;
    }
    //display method
    public void display(){
        System.out.println("Guest name : "+guestName);
        System.out.println("Room type : "+roomType);
        System.out.println("Nights : "+nights);
    }
}
//main class
public class HotelBookingMain {
    public static void main(String[] args) {
        //instantiation
        HotelBooking room1=new HotelBooking();
        HotelBooking room2=new HotelBooking("ABC","XYZ",3);
        HotelBooking room3=new HotelBooking(room2);
        //displaying
        System.out.println("Room1 details : ");
        room1.display();
        System.out.println("Room2 details : ");
        room2.display();
        System.out.println("Room3(copy of room2) details : ");
        room3.display();
    }
}
