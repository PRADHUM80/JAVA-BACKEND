
public class Account
{
    public String openAccount(String name, int age)
    {
        // Some 100Line.. of Code --> x
        System.out.println("Account. openAccount()....");
        return "some String..";
    }
}

class SavingAccount extends Account
{
    //		Rules ...
		/*
		 * 1. Method Name Should Be Same..
		 * 2. Type Order And Number Args Should Be Same..
		 * 3. ReturnType Should Be Same --> Except Covarient.
		 * 4. AccessModifiers --> Should be Same Or Widen( public --> Public,
		 * 	  protected --> protected, public .) ..or Not reduced..
		 * 5. Exception.
		 * 6. Private Methods Cannot be Override.
		 * 
		 */

    @Override 
     public String openAccount(String name, int age)
    {
        // Some 200Line.. of Code --> x+1
        System.out.println("Account. openAccount()....");
        return "some String..";
    }
}