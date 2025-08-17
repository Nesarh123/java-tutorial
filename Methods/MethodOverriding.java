package Methods;

class Calc
{
    public int add(int n1, int n2)
    {
        return n1+n2;
    } 
    public int sub(int n1, int n2)
    {
        return n1-n2;
    } 
}

class AdvCalc
{
    public int add(int n1, int n2)
    {
        return n1+n2+1;
    } 
}

public class MethodOverriding 
{
    public static void main(String[] args) 
    {
        AdvCalc adv = new AdvCalc();
        System.out.println(adv.add(10, 12));    
    }
}
