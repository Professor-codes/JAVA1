import java.util.Random;
import java.util.Scanner;

public class ExerciseSolution_41 {
    public static void main(String[] args) {
        //
        //
        //
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose from the below : ");
        System.out.println("\n0 -> Rock");
        System.out.println("1 -> Paper");
        System.out.println("2 -> Scissor");
        System.out.print("Enter your option : ");
        int option = sc.nextInt();
        Random rand = new Random();
        int comp = rand.nextInt(3);
        if(option == comp){
            System.out.println("Draw");
        }
        else if(option == 0 && comp ==2 || option == 1 && comp == 0 || option == 2 && comp == 1){
            System.out.println("You Win!");
        }
        else {
            System.out.println("Computer Win!");
        }
        System.out.println("Computer chooice: " + comp);
    }

}
