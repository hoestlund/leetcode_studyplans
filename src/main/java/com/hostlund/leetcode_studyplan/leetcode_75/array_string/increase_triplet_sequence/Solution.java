package com.hostlund.leetcode_studyplan.leetcode_75.array_string.increase_triplet_sequence;

public class Solution {

  public boolean increasingTriplet(int[] nums) {
    if (nums.length < 3) {
      return false;
    }
    int counter = 0;
    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] < nums[i + 1]) {
        counter++;
        if (counter == 2) {
          return true;
        }
      } else {
        counter = 0;
      }
    }
    return false;

  }
}
