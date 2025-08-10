package Constructors;

class Human
{
    private int age;
    private String name;
    
    public Human()
    {
        age = 12;
        name = "Rahul";
    }
    public int getAge() 
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
}

public class Constructors 
{
    public static void main(String[] args) 
    {
        Human human = new Human();
        human.setAge(26);
        human.setName("Nesar");
        System.out.println(human.getName()+" : "+human.getAge());
        
    }
}
