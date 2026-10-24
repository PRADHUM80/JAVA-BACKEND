public class LaptopCompanyMain {
    
    public static void main(String[] args) {
        
        LaptopComapny lc = new LaptopComapny();

        // user1
        Asus as = new Asus();
        lc.company(as);

        // user2
        Dell d = new Dell();
        lc.company(d);

        // user3
        Hp h = new Hp();
        lc.company(h);

        // user4
        Laptop l = new Laptop();
        lc.company(l);
    }
}
