// To call Current Class Methods...........


public class StudentMethods 
{

    // this  is a methods.........
    void display()
    {
        System.out.println("Printing Display Methodss.");
        System.out.println("Hello");
    }  
    
    void show()
    {
        System.out.println("Calling DisplayMethods..........");
        this.display();
    }
}
