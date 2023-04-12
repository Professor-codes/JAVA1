import java.util.Scanner;

public class Ch4_Practice4 {
    public static void main(String[] args) {
        // Question 1
//        int a = 10;
//        if(a==11){
//            System.out.println("I am 11");
//        }
//        else {
//            System.out.println("I am not 11");
//        }

        // Question 2
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter subject 1 marks : ");
//        float sub1 = sc.nextFloat();
//        System.out.print("Enter subject 2 marks : ");
//        float sub2 = sc.nextFloat();
//        System.out.print("Enter subject 3 marks : ");
//        float sub3 = sc.nextFloat();
//
//        float total = (sub1+sub2+sub3);
//        System.out.println("Your total score : " + total);
//
//        float percentage = (total / 300) * 100;
//        System.out.println("Your percentage : " + percentage);
//
//        if (sub1 < 33 || sub2 < 33 || sub3 < 33) {
//            System.out.println("Result : Fail!");
//        }
//        else if (percentage < 40) {
//            System.out.println("Result : Fail!");
//        }
//        else {
//            System.out.println("Result : Pass!");
//        }

        // Question 3
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your income : ");
//        float tax = 0;
//        float income = sc.nextFloat();
//        if(income <= 2.5f){
//            tax = tax+0;
//        }
//        else if (income > 2.5f && income <= 5f){
//            tax = tax + 0.05f * (income - 2.5f);
//        }
//        else if (income >5f && income <= 10f) {
//            tax = tax + 0.2f * (income - 5f);
//            tax = tax + 0.05f * (5f - 2.5f);
//        }
//        else if(income > 10.0f){
//            tax = tax + 0.3f * (income - 10f);
//            tax = tax + 0.05f * (5f - 2.5f);
//            tax = tax + 0.2f * (10f - 5f);
//        }
//        System.out.println("Total tax value : " + tax);

        // Question 3
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your income : ");
//        float tax = 0;
//        float income = sc.nextFloat();
//        if(income<=250000f){
//            tax= tax+0;
//        }
//        else if(income > 250000f && income <=500000f){
//            tax = tax + 0.05f * (income-250000f);
//        }
//        else if(income >500000f && income <= 1000000){
//            tax = tax + 0.2f * (income - 500000f);
//            tax = tax + 0.05f * (500000-250000);
//        }
//        else if(income > 100000){
//            tax = tax + 0.3f * (income - 1000000f);
//            tax= tax + 0.05f * (500000f - 250000f);
//            tax = tax + 0.2f * (1000000f - 500000f);
//        }
//        System.out.println("Total tax value : " + tax);

        // Question 4
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number for days : ");
//        int day = sc.nextInt();
//        switch(day) {
//            case 1 :
//                System.out.println("Happy Monday!");
//                break;
//            case 2:
//                System.out.println("Happy Tuesday!");
//                break;
//            case 3:
//                System.out.println("Happy Wednesday!");
//                break;
//            case 4:
//                System.out.println("Happy Thursday!");
//                break;
//            case 5:
//                System.out.println("Happy Friday!");
//                break;
//            case 6:
//                System.out.println("Happy Saturday!");
//                break;
//            case 7:
//                System.out.println("Happy Sunday!");
//                break;
//        }

        // Question 4
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number for days : ");
//        int day = sc.nextInt();
//        switch(day){
//            case 1 -> System.out.println("Happy Monday!");
//            case 2 -> System.out.println("Happy Tuesday!");
//            case 3 -> System.out.println("Happy Wednesday!");
//            case 4 -> System.out.println("Happy Thursday!");
//            case 5 -> System.out.println("Happy Friday!");
//            case 6 -> System.out.println("Happy Saturday!");
//            case 7 -> System.out.println("Happy Sunday!");
//        }

        // Question 5
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter year : ");
//        int year = sc.nextInt();
//        if(year%4==0){
//            System.out.println("Leap Year!");
//        }
//        else if(year%100==0 || year%400==0){
//            System.out.println("Leap Year!");
//        }
//        else {
//            System.out.println("Not a Leap Year!");
//        }

        // Question 6
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter website : ");
//        String website = sc.next();
//        if(website.endsWith(".org")){
//            System.out.println("This is an Organizational Website");
//        }
//        else if(website.endsWith(".com")){
//            System.out.println("This is a commercial Website");
//        }
//        else if(website.endsWith(".in")){
//            System.out.println("This is an Indian Website");
//        }

    }
}
