package Arrays;

public class Three_Dimensional_Array 
{
    public static void main(String[] args)
    {
        int nums[][][] = new int[3][4][5] ;
        for (int a = 0; a < 3; a++)
        {
            for (int j = 0; j < 4; j++)
            {
                for (int k = 0; k < 5; k++)
                {
                    nums[a][j][k] = (int)(Math.random() * 10);
                }
            }
        }
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                for (int k = 0; k < 5; k++)
                {
                    System.out.print(nums[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();
        for(int n[][] : nums)
        {
            for (int m[] : n)
            {
                for (int o : m)
                {
                    System.out.print(o + " ");
                }
            }
            System.out.println();
        }
    }
}
