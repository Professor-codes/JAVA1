import java.util.Scanner;

public class ExerciseSolution_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter subject 1 marks : ");
        float sub1 = sc.nextFloat();
        System.out.print("Enter subject 2 marks : ");
        float sub2 = sc.nextFloat();
        System.out.print("Enter subject 3 marks : ");
        float sub3 = sc.nextFloat();
        System.out.print("Enter subject 4 marks : ");
        float sub4 = sc.nextFloat();
        System.out.print("Enter subject 5 marks : ");
        float sub5 = sc.nextFloat();
        float score = (sub1+sub2+sub3+sub4+sub5);
        System.out.println(score);
        System.out.print("Enter your total marks : ");
        float total = sc.nextFloat();
        float totalscore = total*5;
        float percentage = ((score / totalscore)*total);
        System.out.println(percentage);





    }
}
