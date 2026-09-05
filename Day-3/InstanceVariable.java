
// An instance variable is declared inside a class but outside any method, constructor, or block.
// OR   .. A variable declared inside a class but outside methods and without static is called an instance variable.

public class InstanceVariable {

    // Instance variables
    int a; // instance variable
    int b; // instance variable

    public static void main(String[] args) {
        InstanceVariable obj = new InstanceVariable();
        obj.a = 10; // assigning value to instance variable a
        obj.b = 20; // assigning value to instance variable b
        int sum = obj.a + obj.b; // using instance variables
        System.out.println("Sum of a and b is: " + sum);
    }
    
}


// Each object gets its own copy of instance variables.
// Class + outside method + non-static → Instance Variable.