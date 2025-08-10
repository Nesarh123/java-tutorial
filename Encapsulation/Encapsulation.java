package Encapsulation;

class Human
{
    private int age;
    private String name;
    public int getAge() 
    {
        return age;
    }
    public void setAge(int a)
    {
        age = a;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name = n;
    }
}

public class Encapsulation 
{
    public static void main(String[] args) 
    {
        Human human = new Human();
        human.setAge(26);
        human.setName("Nesar");
        System.out.println(human.getAge());
        System.out.println(human.getName());

    }
}
