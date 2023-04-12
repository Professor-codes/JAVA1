import java.util.Scanner;

public class Errors_78 {
    public static void main(String[] args) {
        // Syntax error
        //int a = 5;
        //System.out.println("Hello Java");
        //System.out.println(a + b); -> b is not declared

        // Logical error
        //System.out.println(2);
        //for (int i = 1; i < 5; i++) {
        //    System.out.println(2 * i + 1); -> logic is not for prime numbers
        //}

        // Runtime error
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        float num = sc.nextInt();
        System.out.println("100 / num = " + (100 / num));

    }
}
