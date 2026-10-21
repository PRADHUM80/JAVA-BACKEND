package OverLoading.overloading2;

public class HotstarMain {

    public static void main(String[] args) {
        
        Hotstar sign = new Hotstar();

        sign.doLogin("80884267802", 5423);
		sign.doLogin("pk34@gmail.com", "pk@12");
		sign.doLogin("pk80", "Pk8080", 8080);
    }
}
