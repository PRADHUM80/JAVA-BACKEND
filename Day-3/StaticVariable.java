
// A variable declared inside a class with the static keyword is called a static variable.
// Static variables are also known as class variables because they are shared among all instances of the class.
// A static variable is shared by all objects of the class.
// static → One shared copy for the class


public class StaticVariable {

    static int a; // static variable
    public static void main(String[] args) {
        // Static variable
        StaticVariable obj1 = new StaticVariable();
        StaticVariable obj2 = new StaticVariable();
        
        obj1.a = 10; // assigning value to static variable a using obj1
        obj2.a = 20; // assigning value to static variable a using obj2
        
        System.out.println("Value of a using obj1: " + obj1.a); // Output: 20
        System.out.println("Value of a using obj2: " + obj2.a); // Output: 20
    }
}
