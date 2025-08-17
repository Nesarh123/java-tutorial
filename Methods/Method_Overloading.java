package Methods;

class Calculator 
{
    public int add (int num1, int num2, int num3)
    {
        return num1 + num2 + num3;
    }
    public int add (int num1, int num2)
    {
        return num1 + num2;
    }
    public double add (double num1, int num2)
    {
        return (num1 + num2);
    }
}
public class Method_Overloading {
    public static void main(String[] args)
    { 
        Calculator cal = new Calculator();
        double res = cal.add(3.5, 4);
        System.out.println(res);
    }
    
}
