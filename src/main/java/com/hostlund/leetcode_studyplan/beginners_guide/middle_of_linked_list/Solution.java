package com.hostlund.leetcode_studyplan.beginners_guide.middle_of_linked_list;


class Solution {

  public ListNode middleNode(ListNode head) {
    double length = 0;
    ListNode current = head;
    while (current != null) {
      length++;
      current = current.next;
    }

    current = head;
    for (int i = 0; i < (int) (length / 2); i++) {
      current = current.next;
    }
    return current;
  }

  public static class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }
}
