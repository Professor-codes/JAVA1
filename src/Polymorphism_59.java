//interface Camera1 {
//    void takeSnap();
//
//    void record();
//
//    private void turnOff() {
//        System.out.println("Turning off...");
//    }
//
//    default void record4k() {
//        turnOff();
//        System.out.println("Video recording in 4k...");
//    }
//}
//
//interface Wifi1 {
//    String[] getNetwork();
//
//    void connect(String network);
//}
//
//class CellPhone1 {
//    void pickCall() {
//        System.out.println("Connecting...");
//    }
//
//    void phoneCall(int number) {
//        System.out.println("Calling... " + number);
//    }
//}
//
//class SmartPhone1 extends CellPhone1 implements Camera1, Wifi1 {
//    public void takeSnap() {
//        System.out.println("Taking snap...");
//    }
//
//    public void record() {
//        System.out.println("Video recording...");
//    }
//
//    public String[] getNetwork() {
//        System.out.println("Available networks : ");
//        String[] networkAvailable = {"Jio-5G", "Vi-4G", "Airtel-4G"};
//        for (String networks : networkAvailable) {
//            System.out.println(networks);
//        }
//        return networkAvailable;
//    }
//
//    public void connect(String network) {
//        System.out.println("Connecting..." + network);
//    }
//}

public class Polymorphism_59 {
    public static void main(String[] args) {
//        // Camera reference - only camera functions are allowed
//        Camera1 obj1 = new SmartPhone1();
//        obj1.takeSnap();
//        obj1.record();
//        obj1.record4k();
//        //obj1.getNetwork(); -> Not allowed
//        //obj1.connect(); -> Not allowed
//        //obj1.pickCall(); -> Not allowed
//        //obj1.phoneCall(); -> Not allowed

//        // Wifi reference - only wifi functions are allowed
//        Wifi1 obj2 = new SmartPhone1();
//        //obj2.takeSnap(); -> Not allowed
//        //obj2.record(); -> Not allowed
//        //obj2.record4k(); -> Not allowed
//        obj2.getNetwork();
//        obj2.connect("Vi-4G");
//        //obj2.pickCall(); -> Not allowed
//        //obj2.phoneCall(); -> Not allowed

//        // CellPhone reference - only cellphone functions are allowed
//        CellPhone1 obj3 = new SmartPhone1();
//        //obj3.takeSnap(); -> Not allowed
//        //obj3.record(); -> Not allowed
//        //obj3.record4k(); -> Not allowed
//        //obj3.getNetwork(); -> Not allowed
//        //obj3.connect(); -> Not allowed
//        obj3.pickCall();
//        obj3.phoneCall(1234);

//        // Smartphone reference - all functions are allowed
//        SmartPhone1 obj4 = new SmartPhone1();
//        obj4.takeSnap();
//        obj4.record();
//        obj4.record4k();
//        obj4.getNetwork();
//        obj4.connect("Vi-4G");
//        obj4.pickCall();
//        obj4.phoneCall(1234);
    }
}
