// Java program to remove duplicates from sorted list

import java.util.Scanner;

public class ListNode {
  int val;
  ListNode next;
  
  ListNode() {}
  ListNode(int val) { this.val = val; }
  ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
  public ListNode deleteDuplicates (ListNode head) {
    if (head == null || head.next == null)
      return head;
      // assuming list contain only one element
      
    // creating copy of head to travel the list . Head always point first element.
    ListNode current = head;
    
    while (current != null && current.next != null) {
      if (current.val == current.next.val) {
        current.next = current.next.next;
      } else {
        current = current.next;
      }
    }
    return head;
  }
}

