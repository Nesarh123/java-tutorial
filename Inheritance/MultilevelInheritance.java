package Inheritance;

public class MultilevelInheritance 
{
    public static void main(String[] args) 
    {
        SciCalc scical = new SciCalc();
        int r1 = scical.add(4,6);
        int r2 = scical.sub(6,4);
        int r3 = scical.mul(4,6);
        int r4 = scical.div(15,5);
        double r5 = scical.pow(4, 2);
        System.out.println(r1 + " " + r2 + " " + r3 + " " +  r4 + " " + r5);
    }        
}
