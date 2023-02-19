public class Person {
private  String name;
private int age;
public void setName(String name){
    this.name = name;
}
public void setAge(int age){
    this.age=age;
}
public String getName() {

    return name;
    }

public int getAge(){
    return age;
}
public static void main(String[]args){
    Person myObj=new Person();
      myObj.setName("Ayesha");
    myObj.setAge(21);
    System.out.println(myObj.getName());
    System.out.println(myObj.getAge());

}

}