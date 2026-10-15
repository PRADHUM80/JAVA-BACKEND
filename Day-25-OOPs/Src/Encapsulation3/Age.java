package Src.Encapsulation3;

public class Age 
{

    private  int age;

    public  Age(int age)
    {
        if(age > 1 && age < 125)
        {
            this.age = age;
        }
        else{
            System.out.println("Invailed Age : ");
        }
    }

    public int getAge()
    {
        return age;
    }


}
