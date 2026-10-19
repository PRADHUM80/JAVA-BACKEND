package Src.Encapsulation3;

/**
 * Mobile
 *  */

public class MobileRecharge 
{
    
    public static void main(String[] args) {
        
        Mobile mob = new Mobile();

        mob.recharge(349.0);
        System.out.println(mob.getRecharge());
    }
}
