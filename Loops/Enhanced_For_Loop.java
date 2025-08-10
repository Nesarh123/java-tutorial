package Loops;

public class Enhanced_For_Loop 
{
    public static void main(String[] args) 
    {
        int[] nums = new int [4];
        nums[0] = 4;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 1;
        // for (int i = 0; i < nums.length; i++)
        // {
        //     System.out.println(nums[i]);
        // }   
        for (int n : nums)
        {
            System.out.println(n);
        }
    }
}
