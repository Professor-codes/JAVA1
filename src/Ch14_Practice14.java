import java.util.Scanner;

public class Ch14_Practice14 {
    public static void main(String[] args) {
        // Question 1
        // syntax error -
        // int a = 7

        // logical error -
        // int age = 20;
        // int year_born = 2000-20;

        // runtime error -
        // System.out.println(6/0);

        // Question 2
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number : ");
//        int num = sc.nextInt();
//        try {
//            int a = 20;
//            System.out.println(a / num);
//        } catch (ArithmeticException e) {
//            System.out.println("ArithmeticException");
//            System.out.println("HaHaHa...");
//        } catch (IllegalArgumentException e) {
//            System.out.println("IllegalArgumentException");
//            System.out.println("HeHeHe...");
//        }

        // Question 3
//        int arr[] = new int[5];
//        arr[0] = 10;
//        arr[1] = 20;
//        arr[2] = 30;
//        arr[3] = 40;
//        arr[4] = 50;
//        boolean flag = true;
//        while (true) {
//            Scanner sc = new Scanner(System.in);
//            System.out.print("Enter array index : ");
//            int index = sc.nextInt();
//            try {
//                System.out.println("Array index : arr[" + index + "]");
//                System.out.println("Index value : " + arr[index]);
//                flag = false;
//            } catch (ArrayIndexOutOfBoundsException e) {
//                System.out.println("ArrayIndexOutOfBoundsException: ");
//                System.out.println(e);
//                System.out.println("end of program");
//                break;
//            }
//        }

        // Question 4
//        int arr[] = {10,20,30,40,50};
//        boolean flag = true;
//        Scanner sc = new Scanner(System.in);
//        int i=0;
//        while(flag && i<5){
//            try{
//                System.out.print("Enter array index : ");
//                int index = sc.nextInt();
//                System.out.println("Array index : arr[" + index + "]");
//                System.out.println("Index value : " + arr[index]);
//                break;
//            }catch(Exception e){
//                System.out.println("Invalid array index -0");
//                System.out.println(e);
//                i++;
//            }
//        }
//        if(i>=5){
//            System.out.println("error");
//            System.out.println("end of program");
//        }
//        else if(i<=4){
//            System.out.println("valid array index -1");
//            System.out.println("end of program");
//        }
        boolean flag = true;
        int arr[] = {10,20,30,40,50};
        Scanner sc = new Scanner(System.in);
        int i=0;
        while(flag && i<5){
            try{
                System.out.print("Enter array index : ");
                int index = sc.nextInt();
                System.out.println("Array index : arr[" + index + "]");
                System.out.println("Array value : " + arr[index]);
                break;
            }catch(Exception e){
                System.out.println("invalid array index -0");
                i++;
            }
        }
        if(i>=5){
            System.out.println("error");
            System.out.println("end of program");
        }
        else if(i<=4){
            System.out.println("valid array index -1");
            System.out.println("end of program");
        }
    }
}
