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
}
public class Static_defination 
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


        mob1.show();
        mob2.show();
    }    
}
