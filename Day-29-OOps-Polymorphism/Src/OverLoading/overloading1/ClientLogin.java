package OverLoading.overloading1;

public class ClientLogin {
    
    public static void main(String[] args) {
        
        Client c = new Client();

        c.doLogin("pk80@gmail.com", "8080");

        c.doLogin("8080876654", 7656);

        c.doLogin("pk80@gmail.com");
        
    }
}
