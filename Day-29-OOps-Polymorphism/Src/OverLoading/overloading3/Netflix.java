package OverLoading.overloading3;

public class Netflix {
    
    public  void signUp(String email, String pass)
    {
        System.out.println("Login Success.!!. --> signUp(String email, String pass) " + email + " " + pass);
    }

    public void signUp(String mobNo, int otp, String forget)
    {
        System.out.println("Login success --> signUp(String mobNo, int otp, String forget)");
    }
}
