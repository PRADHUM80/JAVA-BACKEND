package Src.Encapsulation4;

public class EmployeeBonusMain {
    
    public static void main(String[] args) {
        
        EmployeeBonus bonus = new EmployeeBonus("Pradhum", 30000.0);

        bonus.calculateBonus(5000);

        System.out.println(bonus.getBonus());
    }
}
