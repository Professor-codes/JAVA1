//class FirstThread extends Thread {
//    public void run() {
//        int i = 0;
//        while (i <= 20) {
//            System.out.println("Thread - 1");
//            i++;
//        }
//    }
//}
//
//class SecondThread extends Thread {
//    public void run() {
//        int i = 0;
//        while (i <= 20) {
//            System.out.println("Thread - 2");
//            i++;
//        }
//    }
//}

public class ThreadClass_70 {
    public static void main(String[] args) {
//        // Creating thread using class Thread
//        FirstThread obj1 = new FirstThread();
//        SecondThread obj2 = new SecondThread();
//        obj1.start();
//        obj2.start();
    }
}

/*
Method :
void sum(int a, int b) -> parameters

Call the method :
sum(1, 2) -> arguments
*/

/*
Concurrency :
person 1 (cooking)
person 1 (chatting)
Both work done by person 1
But completed only one work at a time

Parallelism :
person 1 (cooking)
person 2 (chatting)
Both work done by person 1 & 2
And completed both at a time
*/