package Keywords;

class Calc
{
    final public void show()
    {
        System.out.println("By Nesar");
    }
    public void add(int a, int b)
    {
        System.out.println(a + b);
    }
}

class AdvCalc extends Calc
{
    public void show()
    {
        System.out.println("By Sumit");
    }
}

public class Final 
{
    public static void main(String[] args) 
    {
        final String name = "Nesar";
        System.out.println(name);

        Calc calc = new Calc();
        calc.show();
        calc.add(3, 4);
    }
}
