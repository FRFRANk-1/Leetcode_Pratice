package Leetcode_problems;

import java.util.HashMap;
import java.util.Map;

public class leetcode_733_FloodFill {

  public boolean isAnagram(String s, String t) {
    Map<Character, Integer> count = new HashMap<>();

    // Count the frequency of characters in string s
    for (char x : s.toCharArray()) {
      count.put(x, count.getOrDefault(x, 0) + 1);
      System.out.println("After adding " + x + ": " + count);
    }

    // Decrement the frequency of characters in string t
    for (char x : t.toCharArray()) {
      count.put(x, count.getOrDefault(x, 0) - 1);
      System.out.println("After subtracting " + x + ": " + count);
    }

    // Check if any character has non-zero frequency
    for (Map.Entry<Character, Integer> entry : count.entrySet()) {
      if (entry.getValue() != 0) {
        System.out.println("Character " + entry.getKey() + " has non-zero frequency: " + entry.getValue());
        return false;
      }
    }

    System.out.println("All characters balanced. It is an anagram.");
    return true;
  }

  public static void main(String[] args){
    leetcode_733_FloodFill test = new leetcode_733_FloodFill();
    // Example 1
    String s1 = "anagram";
    String t1 = "nagaram";
    System.out.println("Test 1 - Is '" + s1 + "' an anagram of '" + t1 + "'? " + "\n" + test.isAnagram(s1, t1));

    // Example 2
    String s2 = "rat";
    String t2 = "car";
    System.out.println("Test 2 - Is '" + s2 + "' an anagram of '" + t2 + "'? " + "\n" + test.isAnagram(s2, t2));
  }
}
