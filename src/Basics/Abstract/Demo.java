package Basics.Abstract;



abstract class Car{

    public abstract void drive();
    public void playMusic(){
        System.out.println("playing music");
    }

}

class WagnoR  extends Car{

    public void  drive ()
    {
        System.out.println("driving");
    }

}
public class Demo {
    public static void main(String[] args) {
// creating objects,
        Car obj = new Car();
        obj.drive();
        obj.playMusic();
    }
}
