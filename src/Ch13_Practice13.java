// Question 1
//class Gm extends Thread {
//    public void run() {
//        int i = 0;
//        while (i <= 20) {
//            System.out.println("Good morning");
//            i++;
//        }
//    }
//}
//
//class Wlcm extends Thread {
//    public void run() {
//        int i = 0;
//        while (i <= 20) {
//            System.out.println("Welcome");
//            i++;
//        }
//    }
//}

// Question 2
//class Gm implements Runnable{
//    public void run(){
//        int i=0;
//        while(i<=20){
//            System.out.println("Good morning");
//            i++;
//        }
//    }
//}
//class Wlcm implements Runnable{
//    public void run(){
//        int i=0;
//        while(i<=20){
//            System.out.println("Welcome");
//            i++;
//        }
//    }
//}

import java.security.spec.ECField;

// Question 3
//class Gm extends Thread {
//    public void run() {
//        int i = 0;
//        while (i <= 100) {
//            try {
//                Thread.sleep(200);
//            } catch (Exception e) {
//                System.out.println(e);
//            }
//            System.out.println("Good morning");
//            i++;
//        }
//    }
//}
//
//class Wlcm extends Thread {
//    public void run() {
//        int i = 0;
//        while (i <= 100) {
//            try {
//                Thread.sleep(200);
//            } catch (Exception e) {
//                System.out.println(e);
//            }
//            System.out.println("Welcome");
//            i++;
//        }
//    }
//}

// Question 4
//class FirstThread extends Thread {
//    public void run() {
//        int i = 0;
//        while (i <= 10) {
//            System.out.println("Thread - 1");
//            i++;
//        }
//    }
//}
//
//class SecondThread extends Thread {
//    public void run() {
//        int i = 0;
//        while (i <= 10) {
//            System.out.println("Thread - 2");
//            i++;
//        }
//    }
//}

// Question 5
//class FirstThread extends Thread {
//    public void run() {
//        System.out.println("First thread running...");
//    }
//}
//
//class SecondThread extends Thread {
//    public void run() {
//        System.out.println("Second thread running...");
//    }
//}

// Question 6
//class FirstThread implements Runnable {
//    public void run() {
//        System.out.println("First thread running...");
//    }
//}
//
//class SecondThread implements Runnable {
//    public void run() {
//        System.out.println("Second thread running...");
//    }
//}

// Question 7
//class FirstThread extends Thread {
//    public void run() {
//        System.out.println("First thread running...");
//    }
//}
//
//class SecondThread extends Thread {
//    public void run() {
//        System.out.println("Second thread running...");
//    }
//}

public class Ch13_Practice13 {
    public static void main(String[] args) {
        // Question 1
//        Gm obj1 = new Gm();
//        Wlcm obj2 = new Wlcm();
//        obj1.start();
//        obj2.start();

        // Question 2
//        Gm item1 = new Gm();
//        Thread box1 = new Thread(item1);
//        Wlcm item2 = new Wlcm();
//        Thread box2 = new Thread(item2);
//        box1.start();
//        box2.start();

        // Question 3
//        Gm obj1 = new Gm();
//        Wlcm obj2 = new Wlcm();
//        obj1.start();
//        obj2.start();

        // Question 4
//        FirstThread obj1 = new FirstThread();
//        SecondThread obj2 = new SecondThread();
//        obj1.setPriority(6);
//        obj2.setPriority(8);
//        System.out.println("First thread priority : " + obj1.getPriority());
//        System.out.println("Second thread priority : " + obj2.getPriority());
//        //obj1.start();
//        //obj2.start();

        // Question 5
//        FirstThread obj1 = new FirstThread();
//        SecondThread obj2 = new SecondThread();
//        System.out.println("First thread state : " + obj1.getState());
//        System.out.println("Second thread state : " + obj2.getState());
//        System.out.println();
//        obj1.start();
//        obj2.start();
//        System.out.println("First thread state : " + obj1.getState());
//        System.out.println();
//        System.out.println("Second thread state : " + obj2.getState());
//        System.out.println();
//
//        System.out.println("First thread state : " + obj1.getState());
//        System.out.println("Second thread state : " + obj2.getState());

        // Question 6
//        FirstThread item1 = new FirstThread();
//        Thread box1 = new Thread(item1);
//        SecondThread item2 = new SecondThread();
//        Thread box2 = new Thread(item2);
//
//        System.out.println("First thread state : " + box1.getState());
//        System.out.println("Second thread state : " + box2.getState());
//        System.out.println();
//        box1.start();
//        box2.start();
//        System.out.println("First thread state : " + box1.getState());
//        System.out.println();
//        System.out.println("Second thread state : " + box2.getState());
//        System.out.println();
//
//        System.out.println("First thread state : " + box1.getState());
//        System.out.println("Second thread state : " + box2.getState());

        // Question 7
//        FirstThread obj1 = new FirstThread();
//        SecondThread obj2 = new SecondThread();
//        System.out.println(Thread.currentThread().getState());
    }
}


