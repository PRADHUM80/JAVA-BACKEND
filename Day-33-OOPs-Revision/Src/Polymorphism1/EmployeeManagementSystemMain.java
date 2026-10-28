public class EmployeeManagementSystemMain {
    
    public static void main(String[] args) {
        
        // Upcasting..
		EmployeeManagementSystem e1 = new Developer();
		e1.work();
//		DownCasting...
		Developer d =  (Developer) e1;
		d.writeCode();
		
//		Upcasting..
		EmployeeManagementSystem e2 = new Manager();
		e2.work();
//		DownCasting..
		Manager m = (Manager) e2;
		m.conductMeeting();
    }
}
