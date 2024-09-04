package Leetcode_problems.array;

public class leetcode_27 {

    public int removeElement(int[] nums, int val) {
        int slow_index = 0;
        for (int fast_index = 0; fast_index < nums.length; fast_index++) {
            if (nums[fast_index] != val) {
                nums[slow_index] = nums[fast_index];
                slow_index++;
            }
        }
        return slow_index;
    }


    public static void main(String[] args) {

        leetcode_27 solution = new leetcode_27();
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;

        int newLength = solution.removeElement(nums, val);
        System.out.println("New Length:" + newLength);

        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
