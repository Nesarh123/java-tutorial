package Keywords;

class A
{
    public A() 
    {
        super();
        System.out.println("in A");
    }
    public A(int m)
    {
        super();
        System.out.println("in int A");
    }
}

class B extends A
{
    public B()
    {
        super();
        System.out.println("in B");
    }
    public B(int n)
    {
        this();
        System.out.println("in int B");
    }
}

public class ThisAndSuper 
{
    public static void main(String[] args) 
    {
        new B(2); 
    }
}
