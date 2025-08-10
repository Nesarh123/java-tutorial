package Arrays;

public class Array_Creation {
   public Array_Creation() {
   }

   public static void main(String[] args) {
    //   int nums [] = {1, 2, 3, 4};
    //   nums [0] = 6;
    //   System.out.println(nums[0]);

    //Another way of array creation
    // int nums [] = new int [4];
    // nums [0] = 1;
    // nums [1] = 2;
    // nums [2] = 3;
    // nums [3] = 4;
    // for (int i = 0; i < 4; i++)
    // {
    //     System.out.println(nums[i]);
    // }

    //test
    int nums[] = new int[4];
    for(int i:nums)
    {
        System.out.println(i);
    }
   }
}