import java.util.Scanner;

// Question 1
//class Circle {
//    public int radius;
//
//    public int getRadius() {
//        return radius;
//    }
//
//    public float area1() {
//        return (float)(Math.PI * radius * radius);
//    }
//
//    public float diameter() {
//        return (2 * radius);
//    }
//
//    public float circumference() {
//        return (float) (2 * Math.PI * radius);
//    }
//
//    Circle(int r) {
//        this.radius = r;
//    }
//}
//
//class Cylinder extends Circle {
//    public int height;
//
//    public int getHeight() {
//        return height;
//    }
//
//    public float area2() {
//        return (float) ((2 * Math.PI * radius * height) + (2 * Math.PI * radius * radius));
//    }
//
//    public float volume() {
//        return (float) (Math.PI * radius * radius * height);
//    }
//
//    Cylinder(int r, int h) {
//        super(r);
//        this.height = h;
//    }
//}

// Question 2
//class Circle {
//    public int radius;
//
//    public int getRadius() {
//        return radius;
//    }
//
//    public double area() {
//        return (Math.PI * radius * radius);
//    }
//
//    Circle(int r) {
//        this.radius = r;
//    }
//}
//
//class Cylinder extends Circle {
//    public int height;
//
//    public int getHeight() {
//        return height;
//    }
//
//    public double area1() {
//        return ((2 * Math.PI * radius * height) + (2 * Math.PI * radius * radius));
//    }
//
//    Cylinder(int r, int h) {
//        super(r);
//        this.height = h;
//    }
//}

// Question 3
//class Rectangle {
//    public int length, width;
//
//    public int getLength() {
//        return length;
//    }
//
//    public int getWidth() {
//        return width;
//    }
//
//    public float area1() {
//        return (length * width);
//    }
//
//    Rectangle(int l, int w) {
//        this.length = l;
//        this.width = w;
//    }
//}
//
//class Cuboid extends Rectangle {
//    public int height;
//
//    public int getHeight() {
//        return height;
//    }
//
//    public float area2() {
//        return (2 * length * width + 2 * length * height + 2 * height * width);
//    }
//
//    Cuboid(int l, int w, int h) {
//        super(l, w);
//        this.height = h;
//    }
//}

// Question 4
//class Base {
//    public void print1(){
//        System.out.println("This is Base Class");
//    }
//}
//class Derived1 extends Base {
//    public void print2(){
//        System.out.println("This is Derived 1 Class");
//    }
//}
//class Derived2 extends Derived1 {
//    public void print3(){
//        System.out.println("This is Derived 3 Class");
//    }
//}


public class Ch10_Practice10 {
    public static void main(String[] args) {
        // Question 1
//        /*
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter radius and height values : ");
//
//         Circle obj1 = new Circle(sc.nextInt());
//         System.out.println("Circle radius : " + obj1.getRadius());
//         System.out.println("Circle area : " + obj1.area());
//         System.out.println("Circle diameter : " + obj1.diameter());
//         System.out.println("Circle circumference : " + obj1.circumference());
//        */
//
//        Cylinder obj2 = new Cylinder(3, 4);
//        // Cylinder obj2 = new Cylinder(sc.nextInt(), sc.nextInt());
//
//        System.out.println("Circle radius : " + obj2.getRadius());
//        System.out.println("Circle area : " + obj2.area1());
//        System.out.println("Circle diameter : " + obj2.diameter());
//        System.out.println("Circle circumference : " + obj2.circumference());
//        System.out.println();
//
//        System.out.println("Cylinder radius : " + obj2.getRadius());
//        System.out.println("Cylinder height : " + obj2.getHeight());
//        System.out.println("Cylinder area : " + obj2.area2());
//        System.out.println("Cylinder volume : " + obj2.volume());

        // Question 2
//        /*
//        Circle obj1 = new Circle(4);
//        System.out.println("Circle radius : " + obj1.getRadius());
//        System.out.println("Circle area : " + obj1.area());
//        */
//
//        Cylinder obj2 = new Cylinder(4, 5);
//        System.out.println("Circle radius : " + obj2.getRadius());
//        System.out.println("Circle area : " + obj2.area());
//        System.out.println();
//
//        System.out.println("Cylinder radius : " + obj2.getRadius());
//        System.out.println("Cylinder height : " + obj2.getHeight());
//        System.out.println("Cylinder area : " + obj2.area1());

        // Question 3
//        /*
//        Rectangle obj1 = new Rectangle(4, 3);
//        System.out.println(obj1.getLength());
//        System.out.println(obj1.getWidth());
//        */
//
//        Cuboid obj2 = new Cuboid(2, 3, 4);
//        System.out.println("Rectangle length : " + obj2.getLength());
//        System.out.println("Rectangle width : " + obj2.getWidth());
//        System.out.println("Rectangle area : " + obj2.area1());
//        System.out.println();
//
//        System.out.println("Cuboid length : " + obj2.getLength());
//        System.out.println("Cuboid width : " + obj2.getWidth());
//        System.out.println("Cuboid height : " + obj2.getHeight());
//        System.out.println("Cuboid area : " + obj2.area2());
//        System.out.println();

        // Question 4
//        Derived2 obj = new Derived2();
//        /*
//        Execution order -> Base - Derived1 - Derived2
//        */
    }
}
