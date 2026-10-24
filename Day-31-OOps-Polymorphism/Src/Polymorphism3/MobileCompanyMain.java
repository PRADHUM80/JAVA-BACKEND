public class MobileCompanyMain {
    
    public static void main(String[] args) {
        
        MobileCompany mc = new MobileCompany();

        // user1
        IPhone ip = new IPhone();
        mc.company(ip);

        // user2
        Mobile m = new Mobile();
        mc.company(m);

        // user3
        Motorola moto = new Motorola();
        mc.company(moto);

        // user4
        Samsung sm = new Samsung();
        mc.company(sm);

        // user5
        Vivo v = new Vivo();
        mc.company(v);
    }
}
