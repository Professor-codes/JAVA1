public class ThrowThrows_84 {
    // 1
//    public static int sum(int a, int b){
//        int result = a+b;
//        return result;
//    }
    // 2
    public static int divide(int a, int b) throws ArithmeticException {
        int result = a / b;
        return result;
    }

    public static void main(String[] args) {
        // 1
//        int c = sum(2,3);
//        System.out.println("Sum is : " + c);
        // 2
        try {
            int c = divide(5, 0);
            System.out.println("division is : " + c);
        } catch (Exception e) {
            System.out.println("Exception!");
            System.out.println(e);
        }

    }
}
