import java.util.Scanner;

class MyException extends Exception {
    @Override
    public String toString() {
        return "toString()";
    }

    @Override
    public String getMessage() {
        return "getMessage()";
    }
}

public class ExceptionClass_83 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        if (num <= 5) {
            try {
                //throw new MyException("Exception occured!");
                throw new ArithmeticException("Exception occured!");
            } catch (Exception e) {
                System.out.println(e.toString());
                System.out.println(e.getMessage());
                System.out.println(e);
                e.printStackTrace();
            }
            System.out.println("Executed!");
        }
    }
}
