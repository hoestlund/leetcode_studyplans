package com.hostlund.leetcode_studyplan.leetcode_75.two_pointers.move_zeros;

public class Solution {

  // TODO not working when the 0 is at the first index
  public void moveZeroes(int[] nums) {
    for(int i = 0; i < nums.length; i++) {
      if(nums[i] == 0) {
        for(int j = i; j < nums.length - 1; j++) {
          nums[j] = nums[j + 1];
        }
        nums[nums.length - 1] = 0;
      }
    }
  }

}
