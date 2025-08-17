package Encapsulation;

class Human
{
    private int age;
    private String name;
    public int getAge() 
    {
        return age;
    }
    public void setAge(int age, Human human)
    {
        human.age = age;
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

public class This_Keyword 
{
    public static void main(String[] args) 
    {
        Human human = new Human();
        human.setAge(26, new Human());
        human.setName("Nesar");
        System.out.println(human.getName()+" : "+human.getAge());
        
    }   
}
