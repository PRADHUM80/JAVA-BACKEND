

class User  // Parent class..
{
	
}

class AdminUser extends User // AdminUser --> Child class or .  AdminUser is-a type of user.
{
	
	
}

class FinanceUser extends User // FinanceUser --> Child class..
{
	
}


public class Drive {

	public static void main(String[] args) 
	{
		User u1 =  new User(); // User class Reffering to the User Object..
		AdminUser au1 = new AdminUser();
		
		User u2 = (User) new AdminUser(); // Parent class can refer to child class Object --> auto up-casting.
		
		Object au2 = new FinanceUser();
		
		
		AdminUser au = (AdminUser) new User(); // Child class is referring to the parent class Object --> down-casting.
		
	}

}
