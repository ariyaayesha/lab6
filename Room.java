public class Room {
    int roomno;
    String roomtype;
    float roomarea;
    boolean acmachine;

    public Room(){
       System.out.println("room is created") ;

    }
public Room(int no,String name,float cm,boolean t){
        this.roomno=no;
        this.roomtype=name;
        this.roomarea=cm;
        this.acmachine=t;
}
public void display(){
        System.out.println(roomno);
        System.out.println(roomtype);
        System.out.println(roomarea);
        System.out.println(acmachine);

}
public static void main(String[]args){
     Room myObj=new Room();
     Room myObj1=new Room(07,"star",37.8F,false);
     myObj1.display();
}
}
