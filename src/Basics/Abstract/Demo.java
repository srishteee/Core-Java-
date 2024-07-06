package Basics.Abstract;
abstract class Car {
    // an abstract class can have an abstract methods as well as non abstract methods, but for declaring the abstract methods you need to have a abstract class.
    // you can have more than one abstract methods
    public abstract void drive();
    public abstract void fly();
    public void playMusic() {
        System.out.println("playing music...");
    }
}
// if you dont write the one abstRACT METHOD OR FORGOT TO IMPLEMENT ON THIS CLASS THEN YOU HAVE TO MAKE THIS CLASS AS A ABSTRACT CLASS
abstract class WagnoR  extends Car {
    // it is compulsory to write  abstract methods i.e the drive and fly methods because we are extending the Car class

    public void  drive ()
    {
        System.out.println("driving...");

    }
}


class UpdateWagnoR extends  WagnoR   // CONCRETE CLASS
{
    public void  fly (){
        System.out.println("flying...");
    }
}



public class Demo {
    public static void main(String[] args) {
// you cannot create an object for abstract class , you can use the reference one for creating the objects
        // NOW YOU CAN USE UPDATEDWAGNOR FOR CREATE AN OBJ   BECAUSE THAT CLASS IS NON ABSTRACT/ CONCRETE CLASS
        Car obj = new UpdateWagnoR();
        // with the help of objects you can call the methods
           obj.drive();
        obj.playMusic();
        obj.fly();
        };

    }

