

public class test
{
    public static void main(String [] args)
    {
        add add = new add();
        int a = add.add(2, 5);
        System.out.println(a);
    }
}

class add
{
    public int add (int n1, int n2)
    {
        return (n1 + n2);
    }
}