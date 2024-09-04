package Leetcode_problems.array;

import java.util.Arrays;

public class leetcode_977_Squares_Sorted_Array {

  private static int[] getInitialArray() {
    return new int[] {-4,-1,0,3,10};
  }

  public int[] sortedSquares(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      nums[i] *= nums[i];
    }
    Arrays.sort(nums);
    return nums;
  }


  public int[] SqMethod_2(int[] nums) {
    int right = nums.length - 1;
    int left = 0;

    int[] result = new int[nums.length];
    int index = result.length - 1;
    while(left <= right) {
      System.out.println("Current nums[left]: " + nums[left] + ", nums[right]: " + nums[right]);
      if(nums[left] * nums[left] > nums[right] * nums[right]) {
        result[index--] = nums[left] * nums[left];
        System.out.println("Placed " + nums[left] * nums[left] + " at result[" + (index + 1) + "]");
        System.out.println("left number before +: " + left + "\n");
        ++left;
        System.out.println("left number after +: " + left + "\n");
      }
      else {
        result[index--] = nums[right] * nums[right];
        System.out.println("Placed " + nums[right] * nums[right] + " at result[" + (index + 1) + "]");
        System.out.println("right number before -: " + right + "\n");
        --right;
        System.out.println("right number after -: " + right + "\n");
      }
      System.out.println("Current state of result array: " + Arrays.toString(result) + "\n");
    }
    return result;
  }

  public static void main(String[] args) {
    leetcode_977_Squares_Sorted_Array res = new leetcode_977_Squares_Sorted_Array();

    int[] result = res.sortedSquares(getInitialArray());

    int[] result_2 = res.SqMethod_2(getInitialArray());

    System.out.println("Final sorted squares (Method 1): " + Arrays.toString(result));
    System.out.println("Final sorted squares (Method 2): " + Arrays.toString(result_2));
  }

}
