

class PublicVariable
{
    public String name;

    public static void main(String[] args) {
        
        PublicVariable obj = new PublicVariable();
        String name = args[0];
        obj.name = name;
        System.out.println(" My Name is : " + obj.name);

    }
}