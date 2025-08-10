package Methods;

class Calculator 
{
    int num = 5;
    // public int add (int num1, int num2, int num3)
    // {
    //     return num1 + num2 + num3;
    // }
    // public int add (int num1, int num2)
    // {
    //     return num1 + num2;
    // }
    // public double add (double num1, int num2)
    // {
    //     return (num1 + num2);
    // }
}

public class Stack_and_Heap 
{    
    public static void main(String[] args)
    {
        // int data = 10; 
        Calculator cal = new Calculator();
        Calculator cal1 = new Calculator();
        // double res = cal.add(3.5, 4);
        // System.out.println(res);
        cal.num = 10;
        System.out.println(cal.num);
        System.out.println(cal1.num);

    }
    
}
