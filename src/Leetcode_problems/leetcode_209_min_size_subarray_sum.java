package Leetcode_problems;

class leetcode_209_min_size_subarray_sum {
  public int minSubArrayLen(int target, int[] nums) {
    int left = 0;
    int sum = 0;
    int result = Integer.MAX_VALUE;
    for (int right = 0; right < nums.length; right++) {
      sum += nums[right];
      System.out.println("current sum:" + sum);
      while(sum >= target) {
        result = Math.min(result, right - left + 1);
        System.out.println("current result:" + result + " right is:" + right + " left is:" + left );
        sum -= nums[left++];
        System.out.println("Sum is:" + sum);
      }
    }
    return result == Integer.MAX_VALUE ? 0 : result;
  }


  public static void main(String[] args) {
    leetcode_209_min_size_subarray_sum solution = new leetcode_209_min_size_subarray_sum();
    int target = 7;
    int[] nums = {2, 3, 1, 2, 4, 3};
    int min_length = solution.minSubArrayLen(target, nums);
    System.out.println("min length:" + min_length);
  }
}