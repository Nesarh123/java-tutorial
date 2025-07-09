public class If_Else_If {
    public static void main (String[] args){
        int x = 158;
        int y = 109;
        int z = 87;
        if (x > y && x > z)
        {
            System.out.println(x);
            System.out.println("x is greater");
        }
        else if (y > z)
        {
            System.out.println(y);
            System.out.println("y is greater");

        }
        else
        {
            System.out.println(z);
            System.out.println("z is greater");
        }
    }     
}
