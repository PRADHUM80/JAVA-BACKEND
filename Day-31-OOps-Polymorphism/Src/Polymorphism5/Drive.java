public class Drive {
    
    public static void main(String[] args) {
        
        Employee e = new Employee();
        e.markIn();

        // ParentClass can Refer Child Class Object...
        Employee e2 = new HRManager();
        e2.markIn(); // Some Method will behave differently based on the actual Object..


        /** Rule:-  
         * 1. At the time of Compilation , it will check the Methods Exist in class Employee.
         * 
         * 2. At the Time of Execution On (While Running ) it will call the Method on actual Object.
         */
    }
}
