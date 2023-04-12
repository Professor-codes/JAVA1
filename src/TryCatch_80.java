import java.util.Scanner;

public class TryCatch_80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number for division : ");
        int a = 10;
        int b = sc.nextInt();
        // without Try
//        int c = a / b;
//        System.out.println("Result : " + c);
        // with Try
        try {
            int c = a / b;
            System.out.println("Result : " + c);
        } catch (Exception e) {
            System.out.println("Failed to divide, reason");
            System.out.println(e);
        }
        System.out.println("end of the program");
    }
}
