package Inheritance;

class A
{
    public void show()
    {
        System.out.println("Class A");
    }
}

class B extends A
{
    public void show1()
    {
        System.out.println("Class B");
    }
}

public class DowncastingAndUpcasting 
{
    public static void main(String[] args) 
    {
        A obj = (A) new B(); // Upcasting
        obj.show(); 

        B obj2 = (B) obj; // Downcasting
        obj2.show1(); 
    }
}
