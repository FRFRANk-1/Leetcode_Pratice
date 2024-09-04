package Leetcode_problems;

import Leetcode_problems.array.leetcode_27;
import org.junit.Assert;
import org.junit.Test;
public class leetcode_27_test {

    @Test
    public void testRemoveElement(){
        leetcode_27 solution = new leetcode_27();

        int[] nums1 = {0,1,2,2,3,0,4,2};
        int val1 = 2;
        int expectedLength = 5;
        int[] expectedArray1 = {0,1,3,0,4};

        int newLength1 = solution.removeElement(nums1, val1);
        Assert.assertEquals(expectedLength, newLength1);
        for (int i = 0; i < newLength1; i++) {
            Assert.assertEquals(expectedArray1[i], nums1[i]);
        }
    }
}
