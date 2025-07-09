package Loops;
public class For_Loop {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++)
        {
            System.out.println("Day " + i);
            for (int j = 1; j <= 9; j++) 
            {
                System.out.println("Hours " + (j+8) + "-" +(j+9));
            }
        }
        System.out.println("Bye ");
    }
}
