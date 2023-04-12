public class MethodOverloading_32 {
    static void foo(){
        System.out.println("Hey, Good Morning!");
    }
    static void foo(String name){
        System.out.println("Hey, " + name + " Good Morning!");
    }

    static void foo(int a, int b){
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        foo();
        foo("abcd");
        foo(2,2);
    }
}
