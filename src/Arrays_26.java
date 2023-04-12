public class Arrays_26 {
    public static void main(String[] args) {
        // declaration - memory allocation - initialization
        int arr[] = {10, 20, 30, 40, 50};
        System.out.println(arr[0]);
        System.out.println(arr[4]);
        System.out.println();

        int marks[]; // declaration
        marks = new int[5]; // memory allocation
        marks[0] = 10; // initialization
        marks[1] = 20;
        marks[2] = 30;
        marks[3] = 40;
        marks[4] = 50;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println();

        String name[] = {"ab", "cd"};
        System.out.println(name[0]);
        System.out.println(name[1]);

    }
}
