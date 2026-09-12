public class Charss {
    
    static char defultValue;
    public static void main(String[] args) {
        char max = '\uffff';
        System.out.println("Maximum: " + (int)max);

        char min = '\u0000';
        System.out.println("Minimum: " + (int)min);

        System.out.println("Default Value: " + (int)defultValue );
    }
}
