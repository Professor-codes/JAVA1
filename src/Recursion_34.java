import java.util.Scanner;

public class Recursion_34 {

    static int factorial(int num){
        if(num==0 || num==1){
            return 1;
        }
        else{
            int factorial = 1;
            for(int i=1; i<=num; i++){
                factorial *= i;
            }
            return factorial;
        }
    }

     // using static method
//     static int factorial(int num){
//        if(num==0 || num==1){
//            return 1;
//        }
//        else{
//            return num * factorial(num-1);
//        }
//    }

    // Using object method
//    int factorial(int num1){
//        if(num1==0 || num1==1){
//            return 1;
//        }
//        else{
//            return num1 * factorial(num1-1);
//        }
//    }

    public static void main(String[] args) {
        // Factorial of input number - for loop method
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number : ");
//        int num = sc.nextInt();
//        int fact = 1;
//        for(int i=1; i<=num; i++){
//            fact = fact * i;
//        }
//        System.out.println("Factorial of " + num + " is : " + fact);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        int fact = factorial(num);
        System.out.println("Factorial of " +num+ " is : " + fact);

        // Using static method
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number : ");
//        int num = sc.nextInt();
//        int fact = factorial(num);
//        System.out.println("Factorial of " + num + " is : "+ fact);

        // Using object method
//        Recursion_34 obj = new Recursion_34();
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number : ");
//        int num = sc.nextInt();
//        int fact = obj.factorial(num);
//        System.out.println("Factorial of " + num + " is : "+fact);






    }
}
