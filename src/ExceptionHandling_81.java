import java.util.Scanner;

public class ExceptionHandling_81 {
    public static void main(String[] args) {
//        int arr[] = {10, 20, 30, 40, 50};
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter array index : ");
//        int index = sc.nextInt();
//        System.out.print("Enter number for division : ");
//        int num = sc.nextInt();
//        try {
//            System.out.println("Array index : " + arr[index]);
//            System.out.println("Result : " + arr[index] / num);
//        } catch (Exception e) {
//            System.out.println("Exception:");
//            System.out.println(e);
//        }

        int arr[] = new int[10];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 60;
        arr[6] = 70;
        arr[7] = 80;
        arr[8] = 90;
        arr[9] = 100;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the index : ");
        int index = sc.nextInt();
        System.out.print("Enter number for division : ");
        int num = sc.nextInt();
        try {
            System.out.println("Array index : " + arr[index]);
            System.out.println("Result : " + arr[index] / num);
        }
        // ArithmeticException
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException : ");
            System.out.println(e);
        }
        // ArrayIndexOutOfBoundsException
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException : ");
            System.out.println(e);
        }
        // Exception
        catch (Exception e) {
            System.out.println("Exception : ");
            System.out.println(e);
        }

    }
}
