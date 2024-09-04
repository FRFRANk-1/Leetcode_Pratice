package Leetcode_problems.linkedlists;

import java.util.List;

public class remove_linked_list_element {

  private static int[][] head = {
      {1, 2, 6, 3, 4, 5, 6},
      {7, 7, 7, 7}
  };

  private static int[] val = {6, 7};

  // ListNode Class definition
  public class ListNode {
    int val;
    ListNode next;

    // Constructor for ListNode
    ListNode(int val) {
    this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }

  // method to remove elements from linked list
  public ListNode removeElements(ListNode head, int val) {

    // Remove leading elements equals to the value
    while (head != null && head.val == val) {
      head = head.next;
    }
    if (head == null) {
      return head;
    }

    // Remove other elements equals to the value
    ListNode pre = head;
    ListNode cur = head.next;
    while(cur != null) {
      if(cur.val == val) {
        pre.next = cur.next;
      } else {
        pre = cur;
      }
      cur = cur.next;
    }
    return head;
  }

  // Helper method to convert an array into a linked list
  public ListNode arrayToLinkedList(int[] arr) {
    if (arr.length == 0) {
      return null;
    }
    ListNode head = new ListNode(arr[0]);
    ListNode Current = head;

    for (int i = 1; i < arr.length; i++) {
      Current.next = new ListNode(arr[i]);
      Current = Current.next;
    }
    return head;
  }

  // Helper method to print the linked list
  public void printLinkedList(ListNode head) {
    ListNode current = head;
    while (current != null) {
      System.out.println(current.val + " -> ");
      current = current.next;
    }
    System.out.println("Null");
  }

  public void testRemoveLinkedLists() {
    for (int i = 0; i < head.length; i++) {
      // convert the array to a linked list
      ListNode linkedList = arrayToLinkedList(head[i]);

      System.out.println("Origin list" + (i + 1) + ":");
      printLinkedList(linkedList);

      ListNode result = removeElements(linkedList, val[i]);
      System.out.println("List after removeing value" + val[i] + ":");
      printLinkedList(result);
      System.out.println();
    }
  }

    public static void main(String[] args) {
      // Create an instance of the remove_linked_list_element class
      remove_linked_list_element res = new remove_linked_list_element();

      // Run the test cases
      res.testRemoveLinkedLists();
    }
}
