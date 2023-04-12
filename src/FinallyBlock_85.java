import java.util.Scanner;

public class FinallyBlock_85 {
//2
//    public static int meth() {
//        try {
//            int a = 50, b = 10;
//            int c = a / b;
//            return c;
//        } catch (Exception e) {
//            System.out.println(e);
//        } finally {
//            System.out.println("end of program");
//        }
//        return -1;
//    }

    public static void main(String[] args) {
        //1
//        try{
//            int a=50, b=0;
//            int c = a/b;
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }
//        finally{
//            System.out.println("end of program");
//        }

        //2
//        int result = meth();
//        System.out.println("Result is : " + result);

        //3
//        int a=10;
//        int b=5;
//        int c=1;
//        while(true){
//            try{
//                System.out.println(c + " result is : " + a/b);
//                c++;
//            }catch(Exception e){
//                System.out.println(e);
//                break;
//            }
//            finally{
//                System.out.println("end of program");
//            }
//            b--;
//        }

        //4
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number : ");
            int a = 10;
            int b = sc.nextInt();
            System.out.println("Result is : " + a / b);
        }
        // without catch block -> ArithmeticException occured
        finally {
            System.out.println("end of program");
        }


    }
}
