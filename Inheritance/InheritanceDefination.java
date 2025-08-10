package Inheritance;

public class InheritanceDefination 
{
    public static void main(String[] args) 
    {
        AdvCalc advcal = new AdvCalc();
        int r1 = advcal.add(4,6);
        int r2 = advcal.sub(6,4);
        int r3 = advcal.mul(4,6);
        int r4 = advcal.div(15,5);
        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4);
    }    
}
