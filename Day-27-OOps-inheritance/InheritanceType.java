
class Rbi
{
    public void openAccount(String account)
    {
        System.out.println("Parent --> Acccount is Open..");
    }
}

//  Single Inheritance..
class Sbi extends Rbi
{
    @Override 
    public  void openAccount(String account)
    {
        System.out.println("SIngle Inheritaance --> SBI Savving Account Open..." + account);
    }
}

// Multilevel Inheritance...
class Axix extends Sbi
{
    @Override 
    public  void openAccount(String account)
    {
        System.out.println("MultiLevel --> AXis AccountOpen..." + account);
    }
}

// Hierarchial Inheritance...
class Pnb extends Rbi
{
    @Override 
    public  void openAccount(String account)
    {
        System.out.println("Hierachial --> Pnb AccountOpen... " + account);
    }
}
class InheritanceType
{
    public static void main(String[] args) {
        
        // Single - Inheritance..
        System.out.println("Single Inheritance...");
        Sbi s = new Sbi();
        s.openAccount("SBI");

        // Multilevel.
        System.out.println("");
        System.out.println("Multilevel Inheritance...");
        Axix a = new Axix();
        a.openAccount("Axis");

        // Hierarchial.
        System.out.println(" ");
        System.out.println("Hierarchial Inheritance..");
        Pnb p = new Pnb();
        p.openAccount("Pnb");
    }
}