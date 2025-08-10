package Static;

class Mobile
{
    String brand;
    int price;
    static String name;

    static
    {
        name = "phone";
        System.out.println("This is static block");
    }

    public Mobile()
    {
        brand = "";
        price = 90000;
        System.out.println("This is construtor block");
    }

    public void show()
    {
        System.out.println(brand + " : " + price + " : " + name);
    }
}

public class Static_Block 
{
    public static void main(String[] args) throws ClassNotFoundException 
    {
        Class.forName("Mobile");
        
        // Mobile mob1 = new Mobile();
        // mob1.brand = "Apple";
        // mob1.price = 100000;
        // Mobile.name = "Iphone";    

        // Mobile mob2 = new Mobile();
    }    
}
