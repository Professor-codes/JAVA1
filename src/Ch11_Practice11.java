//  class - class : extends
//  interface - class : implements
//  interface - interface : extends

// Question 1
//abstract class Pen{
//    abstract void write();
//    abstract void refill();
//}
//
//class FountainPen extends Pen{
//    void write(){
//        System.out.println("Writing mode on...");
//    }
//    void refill(){
//        System.out.println("Refilling start...");
//    }
//    void changeNib(){
//        System.out.println("Nib changing...");
//    }
//}

// Question 2
//class Monkey {
//    void jump() {
//        System.out.println("Jumping...");
//    }
//
//    void bite() {
//        System.out.println("Biting...");
//    }
//}
//
//interface BasicAnimal {
//    void eat();
//
//    void sleep();
//}
//
//class Human extends Monkey implements BasicAnimal {
//    @Override
//    public void eat() {
//        System.out.println("Eating...");
//    }
//
//    @Override
//    public void sleep() {
//        System.out.println("Sleeping...");
//    }
//
//    void speak() {
//        System.out.println("Hello...");
//    }
//}

// Question 3
//abstract class TelePhone{
//    abstract void ring();
//    abstract void lift();
//    abstract void disconnect();
//}
//class SmartTelePhone extends TelePhone{
//    void ring(){
//        System.out.println("Ringing...");
//    }
//    void lift(){
//        System.out.println("Lifting...");
//    }
//    void disconnect(){
//        System.out.println("Disconnecting...");
//    }
//}

// Question 4
//interface TvRemote {
//    void clickButton();
//
//    void clickOffButton();
//}
//
//interface SmartTvRemote extends TvRemote {
//    void touchButton();
//
//    void touchOffButton();
//}
//
//class Tv implements TvRemote {
//    public void clickButton() {
//        System.out.println("Button clicking...");
//    }
//
//    public void clickOffButton() {
//        System.out.println("Turning off...1");
//    }
//    public void touchButton(){
//        System.out.println("Button touching...");
//    }
//    public void touchOffButton(){
//        System.out.println("Turning off...2");
//    }
//}


public class Ch11_Practice11 {
    public static void main(String[] args) {
        // Question 1
//        FountainPen obj = new FountainPen();
//        obj.write();
//        obj.refill();
//        obj.changeNib();

        // Question 2
//        Human obj1 = new Human();
//        obj1.jump();
//        obj1.bite();
//        obj1.eat();
//        obj1.sleep();
//        obj1.speak();
//
//        Monkey obj2 = new Human();
//        obj2.jump();
//        obj2.bite();
//        //obj2.eat(); -> Not allowed
//        //obj2.sleep(); -> Not allowed
//        //obj2.speak(); -> Not allowed

        // Question 3
//        SmartTelePhone obj1 = new SmartTelePhone();
//        obj1.ring();
//        obj1.lift();
//        obj1.disconnect();
//        TelePhone obj2 = new SmartTelePhone();
//        obj2.ring();
//        obj2.lift();
//        obj2.disconnect();

        // Question 4
//        Tv obj = new Tv();
//        obj.clickButton();
//        obj.clickOffButton();
//        obj.touchButton();
//        obj.touchOffButton();


    }
}
