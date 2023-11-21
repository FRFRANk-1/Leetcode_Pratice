import leetcode_27.leetcode_27;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        leetcode_27 solution = new leetcode_27();

        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;

        int newLength = solution.removeElement(nums, val);
        System.out.println("New Length:" + newLength);

        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");

        }
    }
}
