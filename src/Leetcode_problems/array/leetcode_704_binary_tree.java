package Leetcode_problems.array;

public class leetcode_704_binary_tree {

  public int Binary_search (int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;  // Set right to nums.length - 1 to avoid out-of-bounds error

    while (left <= right) {
      int mid = left + ((right - left) >> 1); // = (right - left / 2) but prevent overflow issues

      // Print the current state for visualization
      System.out.println("left: " + left + " (" + nums[left] + "), right: " + right + " (" + nums[right] + "), mid: " + mid + " (" + nums[mid] + ")");

      if (nums[mid] > target) {
        right = mid - 1;  // Update right to mid - 1
      } else if (nums[mid] < target) {
        left = mid + 1;   // Update left to mid + 1
      } else {
        return mid;  // Target found, return index
      }
    }
    return -1;  // Target not found
  }

  public static void main(String[] args) {
    leetcode_704_binary_tree binarySearch = new leetcode_704_binary_tree();
    int[] nums = {-1, 0, 3, 5, 9, 12};
    int target = 9;

    int result = binarySearch.Binary_search(nums, target);
    System.out.println("The target is found at index: " + result);

    int five = 5;
    int two = 2;
    int res;

    System.out.println("5 / 2 is:" + (five/two));
  }
}


