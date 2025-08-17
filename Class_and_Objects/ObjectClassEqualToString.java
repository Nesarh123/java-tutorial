package Class_and_Objects;

class Laptop
{
    String model;
    int price;
    String name;
    @Override
    public String toString() 
    {
        String result = model + " : " + price;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }
    
}

public class ObjectClassEqualToString 
{
    public static void main(String[] args) 
    {
        Laptop laptop1 = new Laptop();
        laptop1.model = "Lenovo";
        laptop1.price = 1000;

        Laptop laptop2 = new Laptop();
        laptop2.model = "Lenovo";
        laptop2.price = 1000;

        System.out.println(laptop1);

        boolean result = laptop1.equals(laptop2);
        System.out.println(result);
   }
}