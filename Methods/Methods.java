package Methods;
class Computer
{
    public void play_music()
    {
            System.out.println("Playing Music");
    }

    public String getmepen(int cost)
    {
        if (cost >= 10)
            return "PEN";

        return "Enter amount greater than 10";
    }
}

public class Methods {
    public static void main(String a[]){
        Computer com = new Computer();
        com.play_music();
        String str = com.getmepen(10);
        System.out.println(str);
    }
    
}
