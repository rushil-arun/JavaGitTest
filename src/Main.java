public class Main{
    public static void main (String[] args){
        System.out.println("Hi");
        System.out.println(add(5, 3));
        App a = new App(5, 3);
        System.out.println(a.multiply());
    }

    public static int add(int a, int b){
        return a + b;
    }
}