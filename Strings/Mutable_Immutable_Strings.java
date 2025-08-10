package Strings;

public class Mutable_Immutable_Strings 
{
    public static void main(String[] args) 
    {
        String name = new String("Nesar");
        name = name + " Harsha";
        System.out.println("hello " + name);

        String s1 = "Nesar";
        String s2 = "Nesar";
        System.out.println(s1 == s2);
    }
}