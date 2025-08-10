package Static;

class Mobile
{
    String brand;
    int price;
    static String name;

    public void show()
    {
        System.out.println(brand + " : " + price + " : " + name);
    }

    public static void show1(Mobile mob1)
    {
        System.out.println(mob1.brand + " : " + mob1.price + " : " + name);
    }
}

public class Static_Method 
{
    public static void main(String[] args) 
    {
        Mobile mob1 = new Mobile();
        mob1.brand = "Apple";
        mob1.price = 100000;
        Mobile.name = "Iphone";    

        Mobile mob2 = new Mobile();
        mob2.brand = "Samsung";
        mob2.price = 80000;
        Mobile.name = "Android phone";  


        Mobile.show1(mob1);
    }   
}
