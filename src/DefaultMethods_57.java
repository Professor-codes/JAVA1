//interface Camera {
//    void takeSnap();
//
//    void record();
//
//    // private method
//    private void turnOff() {
//        System.out.println("Turning off...");
//    }
//
//    // default method
//    default void record4k() {
//        turnOff(); // private method
//        System.out.println("Video recording in 4k...");
//    }
//}

//interface Wifi {
//    String[] getNetwork();
//
//    void connect(String network);
//}

//class CellPhone {
//    void pickCall() {
//        System.out.println("Connecting...");
//    }
//
//    void phoneCall(int number) {
//        System.out.println("Calling... " + number);
//    }
//}

//class SmartPhone extends CellPhone implements Camera, Wifi {
//    public void takeSnap() {
//        System.out.println("Taking snap...");
//    }
//
//    public void record() {
//        System.out.println("Video recording...");
//    }
//
//    // Override default method
//    @Override
//    // public void record4k() {
//    //     System.out.println("Video recording in 4k... begin");
//    // }
//
//    public String[] getNetwork() {
//        System.out.println("Available networks : ");
//        String[] networkAvailable = {"Jio-5G", "Vi-4G", "Airtel-4G"};
//        return networkAvailable;
//    }
//
//    public void connect(String network) {
//        System.out.println("Connecting to... " + network);
//    }
//}

public class DefaultMethods_57 {
    public static void main(String[] args) {
//        SmartPhone obj = new SmartPhone();
//        // Camera
//        obj.record4k();
//        // obj.turnOff(); -> error
//        // Wifi
//        String[] arr = obj.getNetwork();
//        for (String network : arr) {
//            System.out.println(network);
//        }

//        SmartPhone obj = new SmartPhone();
//        obj.takeSnap();
//        obj.record();
//        obj.record4k();
//        obj.getNetwork();
//        obj.connect("Vi-4G");
//        obj.pickCall();
//        obj.phoneCall(1234);
    }
}
