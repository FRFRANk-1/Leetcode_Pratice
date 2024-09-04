package Leetcode_problems.array;

public class leetcode_209_min_size_subarray {

  // Declare global arrays and targets
  // two-dimensional array
  private static int[][] testArrays = {
      {2, 3, 1, 2, 4, 3},
      {1, 1, 1, 1, 1, 1, 1, 1},
      {1,4,4},
      {0,2,0,1,4}
  };

  private static int[] targets = {7, 11, 4, 6};

  // Method to find the minimum subarray length
  public int minSubArray(int target, int[] nums) {
    int left = 0;
    int sum = 0;
    int result = Integer.MAX_VALUE;

    for (int right = 0; right < nums.length; right++) {
      sum += nums[right];
//      System.out.println("Current sum after including nums[" + right + "] = " + nums[right] + ": " + sum);

      while (sum >= target) {
        result = Math.min(result, right - left + 1);
//        System.out.println("Current result: " + result + ", right: " + right + ", left: " + left);
        sum -= nums[left];
//        System.out.println("Sum after excluding nums[" + left + "] = " + nums[left] + ": " + sum);
        left++;
//        System.out.println("Moved left to: " + left);
      }
    }
    return result == Integer.MAX_VALUE ? 0 : result;
  }

  // Method to run all test cases using global arrays and targets
  public void testMinSubArray() {
    for (int i = 0; i < testArrays.length; i++) {
      int result = minSubArray(targets[i], testArrays[i]);
//      System.out.println("Test Case " + (i + 1) + " - Target: " + targets[i] + ", Array: " + java.util.Arrays.toString(testArrays[i]));
//      System.out.println("Minimum subarray length: " + result + "\n");
    }
  }

  public static void main(String[] args) {
    leetcode_209_min_size_subarray solver = new leetcode_209_min_size_subarray();

    // Run all test cases using the global arrays and targets
    solver.testMinSubArray();
  }
}
