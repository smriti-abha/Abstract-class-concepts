
abstract class college{
    abstract void printInfo();
}

class Student extends college{
    void printInfo(){
        String name="Abha";
        int id=24;
        String address="Aam bagicha GardaniBagh Patna";
        System.out.println(name);
        System.out.println(id);
        System.out.println(address);

    }
}
public class Main {
    public static void main(String[] args) {

        //an instance of abstract class not created
        //constructors are allowed
        //if child is unable to implement parent then child class is also declared with abstract keyword
        //define both instance and static methods
        college c= new Student();
        c.printInfo();

    }
}