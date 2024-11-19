package lv.acodemy;

public class Example{
    public static void main(String[] args) {

        // Access modifier (public, private, protected, package-private)
        // Can return specific data type
        // void - if we do not return anything
        // Method name: should be unique, camelCase;
        // Parameters
        // return keyword if we return something


        // To create method
        // [access modifier] [other modifiers] [return type] methodName {
        // method body
        // return [value]

        // Create method that will print out Hello, World!

     sayHello();

     greet("Kostja");

        System.out.println(add(30, 60));
        int x = add(30, 60);
        System.out.println(x);


        System.out.println(add(12.2, 13.5));

        double a = 12.12;
        double b = 13.5;
        System.out.println(add(a, b));
    }

    public static void sayHello () {
        System.out.println("Hello, Wolrd!");

    }

    public static void greet (String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Methot overloading

    public static int add(int a, int b) {
        return a + b;
    }

    public static  double add(double a, double b){
        return a + b;
    }
}
